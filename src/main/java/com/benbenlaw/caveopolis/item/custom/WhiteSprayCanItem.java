package com.benbenlaw.caveopolis.item.custom;

import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.recipe.SprayerRecipe;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WhiteSprayCanItem extends Item {
    public WhiteSprayCanItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {

        if(Screen.hasShiftDown()) {
            components.add(Component.translatable("tooltips.spray_can.shift.held")
                    .withStyle(ChatFormatting.GREEN));
        }
        else {
            components.add(Component.translatable("tooltips.spray_can.hover.shift").withStyle(ChatFormatting.BLUE));
        }

        super.appendHoverText(stack, level, components, flag);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockPos pos = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        BlockState blockState = level.getBlockState(pos);
        boolean mainHand = true;
        assert player != null;
        if (!player.getItemInHand(InteractionHand.MAIN_HAND).is(this)) {
            mainHand = false;
        }

        if (!level.isClientSide()) {

            if (blockState.is(ModTags.Blocks.BANNED_FROM_IN_WORLD_SPRAYING)) {
                player.sendSystemMessage(Component.literal("This block cannot be converted in world, try the sprayer block instead!"));
                return InteractionResult.FAIL;
            }

            else for (SprayerRecipe recipe : level.getRecipeManager().getAllRecipesFor(SprayerRecipe.Type.INSTANCE)) {
                Ingredient targetBlockIngredient = recipe.getIngredients().get(1);
                BlockState newBlockRecipe = Block.byItem(recipe.getResultItem(Minecraft.getInstance().level.registryAccess()).getItem()).withPropertiesOf(blockState);
                ItemStack sprayCan = recipe.getIngredients().get(0).getItems()[0].getItem().getDefaultInstance();

                if (targetBlockIngredient.test(blockState.getBlock().asItem().getDefaultInstance()) && sprayCan.getItem() == ModItems.WHTIE_SPRAY_CAN.get()) {

                    level.setBlockAndUpdate(pos, newBlockRecipe);
                    level.playSound(null, pos, SoundEvents.BUBBLE_COLUMN_BUBBLE_POP, SoundSource.PLAYERS, Minecraft.getInstance().options.getSoundSourceVolume(SoundSource.MASTER) * 15 , 0.5F);

                    if (mainHand) {
                        player.getItemInHand(InteractionHand.MAIN_HAND).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(player.getUsedItemHand()));
                    } else
                        player.getItemInHand(InteractionHand.OFF_HAND).hurtAndBreak(1, player, (player1) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                    return InteractionResult.SUCCESS;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}