package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.custom.torches.ModWallTorchBlock;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ColorSprayCanItem extends Item {
    private final Block wallTorchBlock;

    public ColorSprayCanItem(Properties properties, Block wallTorchBlock) {
        super(properties);
        this.wallTorchBlock = wallTorchBlock;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltips.spray_can.shift.held_1").withStyle(ChatFormatting.BLUE));
            components.add(Component.translatable("tooltips.spray_can.shift.held_2").withStyle(ChatFormatting.BLUE));
            components.add(Component.translatable("tooltips.spray_can.shift.held_3").withStyle(ChatFormatting.BLUE));
        } else {
            components.add(Component.translatable("tooltips.spray_can.hover.shift").withStyle(ChatFormatting.GREEN));
        }

        super.appendHoverText(stack, level, components, flag);
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
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.invalid_block"));
                    return InteractionResult.FAIL;
                }

                else {
                    for (SprayerRecipe recipe : level.getRecipeManager().getAllRecipesFor(SprayerRecipe.Type.INSTANCE)) {
                        Ingredient targetBlockIngredient = recipe.getIngredients().get(1);
                        BlockState newBlockRecipe = Block.byItem(recipe.getResultItem(level.registryAccess()).getItem()).defaultBlockState();
                        ItemStack sprayCan = recipe.getIngredients().get(0).getItems()[0].getItem().getDefaultInstance();

                        if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.getItem() == this) {
                            if (blockState.getBlock() instanceof WallTorchBlock && wallTorchBlock != null) {
                                BlockState wallTorch = wallTorchBlock.defaultBlockState();
                                level.setBlockAndUpdate(pos, wallTorch);
                            } else {
                                level.setBlockAndUpdate(pos, newBlockRecipe.getBlock().withPropertiesOf(blockState));
                            }
                            player.getItemInHand(context.getHand()).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(player.getUsedItemHand()));
                            level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, sound, 0.5F);

                            return InteractionResult.SUCCESS;
                        }
                    }
                }
            } else {
                assert player != null;
                ItemStack stack = player.getItemInHand(InteractionHand.OFF_HAND);
                CompoundTag nbt = stack.getOrCreateTag();
                if (player.isCrouching()) {
                    nbt.putInt("pos_1_x", pos.getX());
                    nbt.putInt("pos_1_y", pos.getY());
                    nbt.putInt("pos_1_z", pos.getZ());
                    stack.setTag(nbt);
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.pos_1"));
                } else {
                    nbt.putInt("pos_2_x", pos.getX());
                    nbt.putInt("pos_2_y", pos.getY());
                    nbt.putInt("pos_2_z", pos.getZ());
                    stack.setTag(nbt);
                    player.sendSystemMessage(Component.translatable("tooltips.spray_can.pos_2"));
                }
            }
        }
        return InteractionResult.FAIL;
    }

}
