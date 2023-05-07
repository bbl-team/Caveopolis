package com.benbenlaw.caveopolis.item.custom;

import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class SprayCanRemoverItem extends Item {
    public SprayCanRemoverItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        BlockPos blockPos = pContext.getClickedPos();
        Level world = pContext.getLevel();
        BlockState blockState = pContext.getLevel().getBlockState(blockPos);

        if (blockState.is(ModTags.Blocks.COLORED_BRIGHT_STONE)) {

            world.setBlockAndUpdate(blockPos, ModBlocks.BRIGHT_STONE.get().withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_WALL)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_BRICK_WALL.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_STAIRS)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_STAIRS.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }
/*
        if (blockState.is(ModTags.Blocks.COLORED_STONE_WALL)) {

            world.setBlockAndUpdate(blockPos, BLocks.Stone_wall.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }
*/
        if (blockState.is(ModTags.Blocks.COLORED_STONE_STAIRS)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_STAIRS.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE)) {

            world.setBlockAndUpdate(blockPos,Blocks.STONE.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICKS)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_BRICKS.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE_SLABS)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_SLAB.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_SLABS)) {

            world.setBlockAndUpdate(blockPos, Blocks.STONE_BRICK_SLAB.withPropertiesOf(blockState));

            pContext.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, pContext.getPlayer(),
                    (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

            world.playLocalSound((double) blockPos.getX(), (double) blockPos.getY(), (double) blockPos.getZ(), SoundType.SLIME_BLOCK.getStepSound(), SoundSource.BLOCKS, 1f,5,false);

            world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
        }

        return InteractionResult.SUCCESS;
    }
}
