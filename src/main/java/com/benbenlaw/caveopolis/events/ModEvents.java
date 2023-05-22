package com.benbenlaw.caveopolis.events;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraftforge.fml.common.Mod;


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



