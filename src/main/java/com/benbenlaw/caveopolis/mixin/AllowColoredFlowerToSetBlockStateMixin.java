package com.benbenlaw.caveopolis.mixin;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.ColorMap;
import com.benbenlaw.core.block.colored.ColoredFlower;
import com.benbenlaw.core.block.colored.ColoredFlowerPot;
import com.benbenlaw.core.item.CoreDataComponents;
import net.minecraft.core.BlockPos;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(value = FlowerPotBlock.class)
public class AllowColoredFlowerToSetBlockStateMixin {

    @Inject(method = "useItemOn", at = @At("HEAD"), cancellable = true)
    void useItemOn(ItemStack stack, BlockState blockState, Level level, BlockPos blockPos, Player player, InteractionHand hand, BlockHitResult hitResult, CallbackInfoReturnable<ItemInteractionResult> cir) {

        if (Block.byItem(stack.getItem()) instanceof ColoredFlower && blockState.is(Blocks.FLOWER_POT)) {
            BlockState coloredFlowerPot = null;
            if (stack.is(CaveopolisBlocks.COLORED_POPPY.asItem())) {
                coloredFlowerPot = CaveopolisBlocks.COLORED_POTTED_POPPY.get().defaultBlockState();
            }
            if (stack.is(CaveopolisBlocks.COLORED_DANDELION.asItem())) {
                coloredFlowerPot = CaveopolisBlocks.COLORED_POTTED_DANDELION.get().defaultBlockState();
            }
            DyeColor color = ColorMap.getDyeColor(Objects.requireNonNull(stack.get(CoreDataComponents.COLOR)));
            assert coloredFlowerPot != null;
            BlockState newState = coloredFlowerPot.setValue(ColoredFlowerPot.COLOR, color);


            level.setBlock(blockPos, newState, 3);
            level.gameEvent(player, GameEvent.BLOCK_CHANGE, blockPos);
            player.awardStat(Stats.POT_FLOWER);
            stack.consume(1, player);
            cir.setReturnValue(ItemInteractionResult.SUCCESS);
        }
    }

}
