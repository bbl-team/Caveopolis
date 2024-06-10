package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.block.custom.brightblock.Brightable;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.KeyBinding;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.component.DataComponentMap;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeHolder;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.jetbrains.annotations.NotNull;

public class ColorSprayCanItem extends Item {
    public ColorSprayCanItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext tooltipContext, java.util.List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltips.spray_can.shift.held_1").withStyle(ChatFormatting.GREEN));
            components.add(Component.translatable("tooltips.spray_can.shift.held_2").withStyle(ChatFormatting.GREEN));
            components.add(Component.translatable("tooltips.spray_can.shift.held_3", KeyBinding.MASS_SPRAY.getTranslatedKeyMessage()).withStyle(ChatFormatting.GREEN));
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

        //Sound volume (respecting the player's sound settings)
        float sound = 0;
        if (level.isClientSide) {
            sound = Minecraft.getInstance().options.getSoundSourceVolume(SoundSource.MASTER);
        } else sound = 5;

        if (!level.isClientSide) {
            if (mainHand) {

                //Banned block check

                if (blockState.is(ModTags.Blocks.BANNED_FROM_IN_WORLD_SPRAYING)) {
                    assert player != null;
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.invalid_block"));
                    return InteractionResult.FAIL;
                }

                assert player != null;
                if (player.getItemInHand(InteractionHand.MAIN_HAND).is(ModItems.GLOWSTONE_SPRAY_CAN.get()) && blockState.getBlock() instanceof Brightable) {
                    level.setBlockAndUpdate(pos, blockState.cycle(BlockStateProperties.LIT));
                    player.getItemInHand(context.getHand()).hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
                    level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound, 0.5F);
                    return InteractionResult.SUCCESS;
                }

                else {
                    for (RecipeHolder<SprayerRecipe> recipe : level.getRecipeManager().getAllRecipesFor(SprayerRecipe.Type.INSTANCE)) {
                        Ingredient targetBlockIngredient = recipe.value().input();
                        BlockState newBlockRecipe = Block.byItem(recipe.value().output().getItem()).defaultBlockState();
                        Ingredient sprayCan = recipe.value().spraycan();

                        if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.test(this.getDefaultInstance())) {
                            if (blockState.getBlock() instanceof WallTorchBlock) {
                                if (newBlockRecipe.getBlock() instanceof TorchBlock) {
                                    String torch = newBlockRecipe.toString().replace("Block{", "").replace("}", "");
                                    Block wallTorch = BuiltInRegistries.BLOCK.get(new ResourceLocation(torch.replace("torch", "wall_torch")));
                                    level.setBlockAndUpdate(pos, wallTorch.withPropertiesOf(blockState));
                                }
                            }
                            else {
                                level.setBlockAndUpdate(pos, newBlockRecipe.getBlock().withPropertiesOf(blockState));
                            }
                            player.getItemInHand(context.getHand()).hurtAndBreak(1, player, EquipmentSlot.MAINHAND);
                            level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound, 0.5F);

                            return InteractionResult.SUCCESS;
                        }
                    }
                }
            } else {
                assert player != null;
                ItemStack stack = player.getItemInHand(InteractionHand.OFF_HAND);
                DataComponentMap dataComponentMap = stack.getComponents();
                if (player.isCrouching()) {

                    stack.set(ModDataComponents.INT_X_1.get(), pos.getX());
                    stack.set(ModDataComponents.INT_Y_1.get(), pos.getY());
                    stack.set(ModDataComponents.INT_Z_1.get(), pos.getZ());
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.pos_1"));
                } else {

                    stack.set(ModDataComponents.INT_X_2.get(), pos.getX());
                    stack.set(ModDataComponents.INT_Y_2.get(), pos.getY());
                    stack.set(ModDataComponents.INT_Z_2.get(), pos.getZ());
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.pos_2"));
                }
            }

        }
        return InteractionResult.FAIL;
    }

}
