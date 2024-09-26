package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.block.custom.brightblock.Brightable;
import com.benbenlaw.caveopolis.config.ConfigFile;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.KeyBinding;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.NotNull;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class ColorSprayCanItem extends Item {
    public ColorSprayCanItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, java.util.List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltips.spray_can.shift.held_1").withStyle(ChatFormatting.GREEN));
            components.add(Component.translatable("tooltips.spray_can.shift.held_2").withStyle(ChatFormatting.GREEN));
        } else {
            components.add(Component.translatable("tooltips.spray_can.hover.shift").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(stack, tooltipContext, components, flag);
    }


    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        Player player = context.getPlayer();
        BlockState blockState = level.getBlockState(pos);
        boolean mainHand = context.getHand() == InteractionHand.MAIN_HAND;

        // Sound volume (respecting the player's sound settings)
        float sound = level.isClientSide ? Minecraft.getInstance().options.getSoundSourceVolume(SoundSource.MASTER) : 5;

        if (!level.isClientSide) {
            assert player != null;
            if (!player.isCrouching()) {
                if (mainHand) {
                    // Banned block check
                    if (blockState.is(ModTags.Blocks.BANNED_FROM_IN_WORLD_SPRAYING)) {
                        player.sendSystemMessage(Component.translatable("tooltips.spray_can.invalid_block"));
                        return InteractionResult.FAIL;
                    }

                    ItemStack mainHandItem = player.getItemInHand(InteractionHand.MAIN_HAND);
                    boolean massSpraying = Boolean.TRUE.equals(mainHandItem.get(ModDataComponents.MASS_SPRAYING.get()));

                    // Check if the item is the Glowstone Spray Can
                    if (mainHandItem.is(ModItems.GLOWSTONE_SPRAY_CAN.get())) {
                        if (massSpraying) {
                            massToggleBlockState(level, pos, blockState, player, mainHandItem);
                        } else {
                            toggleBlockState(level, pos, blockState, player, mainHandItem);
                        }
                        level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound, 0.5F);
                        return InteractionResult.SUCCESS;
                    } else {
                        // Handle other spray cans using recipes
                        for (RecipeHolder<SprayerRecipe> recipe : level.getRecipeManager().getAllRecipesFor(SprayerRecipe.Type.INSTANCE)) {
                            Ingredient targetBlockIngredient = recipe.value().input();
                            BlockState newBlockRecipe = Block.byItem(recipe.value().output().getItem()).defaultBlockState();
                            Ingredient sprayCan = recipe.value().spraycan();

                            if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.test(mainHandItem)) {
                                if (massSpraying && !blockState.getBlock().asItem().getDefaultInstance().is(ModTags.Items.BANNED_FROM_IN_WORLD_MASS_SPRAYING)) {
                                    massConvertBlocks(level, pos, blockState, player, mainHandItem, newBlockRecipe);
                                } else {
                                    convertBlockWithRecipe(level, pos, blockState, player, mainHandItem, newBlockRecipe);
                                }
                                level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound, 0.5F);
                                return InteractionResult.SUCCESS;
                            }
                        }
                    }
                }
            } else {
                use(level, player, context.getHand());
            }
        }
        return InteractionResult.FAIL;
    }

    private void toggleBlockState(Level level, BlockPos pos, BlockState blockState, Player player, ItemStack itemStack) {
        if (blockState.hasProperty(BlockStateProperties.LIT)) {
            BlockState newState = blockState.cycle(BlockStateProperties.LIT);
            level.setBlockAndUpdate(pos, newState);
            itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
        }
    }


    private static final int MAX_BLOCKS_PER_TICK = ConfigFile.maxMassBlockState.get();
    private void massToggleBlockState(Level level, BlockPos startPos, BlockState targetState, Player player, ItemStack itemStack) {
        Queue<BlockPos> toVisit = new LinkedList<>();
        Set<BlockPos> visited = new HashSet<>();
        toVisit.add(startPos);

        int processed = 0;

        while (!toVisit.isEmpty() && itemStack.getDamageValue() < itemStack.getMaxDamage() && ConfigFile.maxMassBlockStateAllowed.get()) {
            BlockPos currentPos = toVisit.poll();
            if (!visited.contains(currentPos) && level.getBlockState(currentPos).getBlock() == targetState.getBlock()) {
                visited.add(currentPos);
                toggleBlockState(level, currentPos, targetState, player, itemStack);

                processed++;
                if (processed >= MAX_BLOCKS_PER_TICK) {
                    break;
                }

                for (Direction direction : Direction.values()) {
                    BlockPos adjacentPos = currentPos.relative(direction);
                    if (!visited.contains(adjacentPos)) {
                        toVisit.add(adjacentPos);
                    }
                }
            }
        }
        if (!ConfigFile.maxMassBlockStateAllowed.get()) {
            player.sendSystemMessage(Component.translatable("tooltips.spray_can.mass_spraying_disabled"));
        }
    }

    private void convertBlockWithRecipe(Level level, BlockPos pos, BlockState blockState, Player player, ItemStack itemStack, BlockState newBlockState) {
        if (blockState.getBlock() instanceof WallTorchBlock && newBlockState.getBlock() instanceof TorchBlock) {
            String torch = newBlockState.toString().replace("Block{", "").replace("}", "");
            Block wallTorch = BuiltInRegistries.BLOCK.get(ResourceLocation.parse(torch.replace("torch", "wall_torch")));
            level.setBlockAndUpdate(pos, wallTorch.withPropertiesOf(blockState));
        } else {
            level.setBlockAndUpdate(pos, newBlockState.getBlock().withPropertiesOf(blockState));
        }
        itemStack.hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
    }

    private void massConvertBlocks(Level level, BlockPos startPos, BlockState targetState, Player player, ItemStack itemStack, BlockState newBlockState) {
        Queue<BlockPos> toVisit = new LinkedList<>();
        Set<BlockPos> visited = new HashSet<>();
        toVisit.add(startPos);

        while (!toVisit.isEmpty() && itemStack.getDamageValue() < itemStack.getMaxDamage()) {
            BlockPos currentPos = toVisit.poll();
            if (!visited.contains(currentPos) && level.getBlockState(currentPos).getBlock() == targetState.getBlock()) {
                visited.add(currentPos);
                convertBlockWithRecipe(level, currentPos, targetState, player, itemStack, newBlockState);

                for (Direction direction : Direction.values()) {
                    BlockPos adjacentPos = currentPos.relative(direction);
                    if (!visited.contains(adjacentPos)) {
                        toVisit.add(adjacentPos);
                    }
                }
            }
        }
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        if (!level.isClientSide() && player.isCrouching()) {

            if (player.getItemInHand(hand).is(ModTags.Items.SPRAY_CANS)) {

                ItemStack stack = player.getItemInHand(hand);
                boolean currentState = Boolean.TRUE.equals(stack.get(ModDataComponents.MASS_SPRAYING.get()));
                boolean newState = !currentState;  // Toggle the boolean value
                stack.set(ModDataComponents.MASS_SPRAYING.get(), newState);

                // Send a message to the player indicating the new state
                if (newState) {
                    player.sendSystemMessage(Component.literal("Mass spraying enabled").withStyle(ChatFormatting.GREEN));
                } else {
                    player.sendSystemMessage(Component.literal("Mass spraying disabled").withStyle(ChatFormatting.RED));
                }
            }
        }
        return InteractionResultHolder.pass(player.getItemInHand(hand));
    }

}
