package com.benbenlaw.caveopolis.events;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.item.ModItems;
import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.nbt.Tag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.*;


@Mod.EventBusSubscriber(modid = Caveopolis.MOD_ID)

public class ModEvents {

    /*

    @SubscribeEvent
    public static void toColorStone(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    @SubscribeEvent
    public static void toColorStoneBricks(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICKS)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_BRICKS.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    public static void toColorStoneStairs(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_STAIRS)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_STAIRS.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    @SubscribeEvent
    public static void toColorStoneBrickStairs(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_STAIRS)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_BRICK_STAIRS.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    public static void toColorStoneSlab(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_SLAB)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_SLAB.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    @SubscribeEvent
    public static void toColorStoneBrickSlab(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_SLAB)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_BRICK_SLAB.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    public static void toColorStonewall(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        BlockState blockState = event.getWorld().getBlockState(blockPos);
        Level world = event.getWorld();
        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_WALL)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_WALL.get().defaultBlockState(), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }


     */
/*

    @SubscribeEvent
    public static void toColorStoneBrickWall(PlayerInteractEvent.RightClickBlock event) {
        BlockPos blockPos = event.getPos();
        Level world = event.getWorld();
        BlockState blockState = event.getWorld().getBlockState(blockPos);


        if (event.getPlayer().getMainHandItem().is(ModItems.WHITE_PAINTER.get())) {
            if (blockState.is(ModTags.Blocks.COLORED_STONE_BRICK_WALL)) {

                world.setBlock(blockPos, ModBlocks.WHITE_COLORED_STONE_BRICK_WALL.get().withPropertiesOf(blockState), 1);

                event.getPlayer().getItemBySlot(EquipmentSlot.MAINHAND).hurtAndBreak(1, event.getEntityLiving(),
                        (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

                world.addParticle(ParticleTypes.DRIPPING_WATER, (double) blockPos.getX() + 0.5D, (double) blockPos.getY() + 1.1D, (double) blockPos.getZ() + 0.5D, 0.0D, 0.05D, 0.0D);
            }
        }
    }

    */






}



