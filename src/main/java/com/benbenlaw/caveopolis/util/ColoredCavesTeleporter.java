package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.custom.ColoredCavesPortalBlock;
import com.benbenlaw.caveopolis.block.entity.ColoredCavesPortalBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.Main;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.DismountHelper;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.levelgen.structure.templatesystem.AxisAlignedLinearPosTest;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.util.ITeleporter;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class ColoredCavesTeleporter implements ITeleporter {

    public static BlockPos thisPos = BlockPos.ZERO;
    public static boolean insideDimension = true;

    public ColoredCavesTeleporter(BlockPos pos, boolean insideDim) {
        thisPos = pos;
        insideDimension = insideDim;
    }

    @Override
    public Entity placeEntity(Entity entity, ServerLevel currentWorld, ServerLevel destinationWorld,
                              float yaw, Function<Boolean, Entity> repositionEntity) {
        entity = repositionEntity.apply(false);

        if (!(entity instanceof ServerPlayer)) {
            return entity;
        }

        ServerPlayer player = (ServerPlayer) entity;
        LevelChunk chunk = (LevelChunk) destinationWorld.getChunk(thisPos);
        Vec3 spawnPos = findPortalInChunk(chunk);

        if (spawnPos == null) {

            player.sendSystemMessage(Component.literal("No Previous portal discovered in chunk"));

            ResourceKey<Level> coloredCavesDim = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(Caveopolis.MOD_ID, "colored_caves"));
            if (destinationWorld.dimension().equals(coloredCavesDim)) {

                spawnPos = placeTeleporterColoredCaves(destinationWorld, chunk);

            } else {
                spawnPos = placeTeleporterOverworld(destinationWorld, chunk);
            }
        }

        if (spawnPos == null) {
            return entity;
        }

        player.teleportTo(spawnPos.x, spawnPos.y, spawnPos.z);

        return entity;
    }

    private Vec3 placeTeleporterColoredCaves(ServerLevel level, LevelChunk chunk) {
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
        int min = level.getMinBuildHeight();
        int max = level.getMaxBuildHeight();
        for (int y = min; y < max - 1; y = y + 1) {
            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    pos.set(x, y, z);
                    if (chunk.getBlockState(pos).isAir() && chunk.getBlockState(pos.above(1)).isAir() && chunk.getBlockState(pos.above(2)).isAir()) {
                        BlockPos absolutePos = chunk.getPos().getWorldPosition().offset(pos.getX(), pos.getY(), pos.getZ());
                        level.setBlockAndUpdate(absolutePos, ModBlocks.COLORED_CAVES_PORTAL.get().defaultBlockState());
                        return new Vec3(absolutePos.getX() + 0.5, absolutePos.getY() + 1, absolutePos.getZ() + 0.5);
                    }
                }
            }
        }

        for (int y = min; y < max - 1; y = y + 1) {
            for (int x = 0; x < 16; x++) {
                for (int z = 0; z < 16; z++) {
                    pos.set(x, y, z);
                    if (isAirOrStone(chunk, pos) && isAirOrStone(chunk, pos.above(1)) && isAirOrStone(chunk, pos.above(2))) {
                        BlockPos absolutePos = chunk.getPos().getWorldPosition().offset(pos.getX(), pos.getY(), pos.getZ());
                        if (isReplaceable(level, absolutePos.above(3)) &&
                                isReplaceable(level, absolutePos.above(1).relative(Direction.NORTH)) &&
                                isReplaceable(level, absolutePos.above(1).relative(Direction.NORTH)) &&
                                isReplaceable(level, absolutePos.above(1).relative(Direction.SOUTH)) &&
                                isReplaceable(level, absolutePos.above(1).relative(Direction.EAST)) &&
                                isReplaceable(level, absolutePos.above(1).relative(Direction.WEST)) &&
                                isReplaceable(level, absolutePos.above(2).relative(Direction.NORTH)) &&
                                isReplaceable(level, absolutePos.above(2).relative(Direction.SOUTH)) &&
                                isReplaceable(level, absolutePos.above(2).relative(Direction.EAST)) &&
                                isReplaceable(level, absolutePos.above(2).relative(Direction.WEST))
                        ) {
                            level.setBlockAndUpdate(absolutePos, ModBlocks.COLORED_CAVES_PORTAL.get().defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(1), Blocks.AIR.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(2), Blocks.AIR.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(3), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(1).relative(Direction.NORTH), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(1).relative(Direction.SOUTH), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(1).relative(Direction.EAST), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(1).relative(Direction.WEST), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(2).relative(Direction.NORTH), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(2).relative(Direction.SOUTH), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(2).relative(Direction.EAST), Blocks.STONE.defaultBlockState());
                            level.setBlockAndUpdate(absolutePos.above(2).relative(Direction.WEST), Blocks.STONE.defaultBlockState());
                            return new Vec3(absolutePos.getX() + 0.5, absolutePos.getY() + 1, absolutePos.getZ() + 0.5);
                        }
                    }
                }
            }
        }

        return null;
    }

    private boolean isAirOrStone(LevelChunk chunk, BlockPos pos) {
        BlockState state = chunk.getBlockState(pos);
        return state.getBlock().equals(Blocks.STONE) || state.isAir();
    }

    private boolean isReplaceable(Level world, BlockPos pos) {
        BlockState state = world.getBlockState(pos);
        return state.getBlock().equals(Blocks.STONE) ||
                state.getBlock().equals(Blocks.GRANITE) ||
                state.getBlock().equals(Blocks.ANDESITE) ||
                state.getBlock().equals(Blocks.DIORITE) ||
                state.getBlock().equals(Blocks.DIRT) ||
                state.getBlock().equals(Blocks.GRAVEL) ||
                state.getBlock().equals(Blocks.LAVA) ||
                state.getBlock().defaultBlockState().is(ModTags.Blocks.COLORED_STONE) ||
                state.isAir();
    }

    @Nullable
    private Vec3 findPortalInChunk(LevelChunk chunk) {
        for (Map.Entry<BlockPos, BlockEntity> entry : chunk.getBlockEntities().entrySet()) {
            BlockPos pos = entry.getKey();
            BlockEntity blockEntity = entry.getValue();

            if (blockEntity instanceof ColoredCavesPortalBlockEntity) {
                BlockState blockState = chunk.getBlockState(pos);

                // Check if the block state matches your portal block
                if (blockState.getBlock() instanceof ColoredCavesPortalBlock) {
                    Vec3 portalPosition = getTeleporterSpawnPos(chunk.getLevel(), pos);

                    // Debugging output
                    Caveopolis.LOGGER.info("Found ColoredCavesPortalBlock at {} with position {}", pos, portalPosition);

                    return portalPosition;
                }
            }
        }

        return null;
    }


    private static Vec3 getTeleporterSpawnPos(Level level, BlockPos pos) {
        BlockPos dismountPos = findSuitableDismountLocation(level, pos);

        if (dismountPos != null) {
            return new Vec3(dismountPos.getX() + 0.5, dismountPos.getY() + 1, dismountPos.getZ() + 0.5);
        }
        return null;
    }

    private static BlockPos findSuitableDismountLocation(Level level, BlockPos pos) {
        BlockPos abovePos = pos.above();
        if (level.isEmptyBlock(abovePos)) {
            return abovePos;
        }
        return null;
    }

    private Vec3 placeTeleporterOverworld(ServerLevel world, LevelChunk chunk) {
        BlockPos.MutableBlockPos pos = new BlockPos.MutableBlockPos();
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                for (int y = world.getMaxBuildHeight(); y >= world.getMinBuildHeight(); y--) {
                    pos.set(x, y, z);
                    if (chunk.getBlockState(pos).isAir() &&
                            chunk.getBlockState(pos.above(1)).isAir() &&
                            chunk.getBlockState(pos.above(2)).isAir() &&
                            !chunk.getBlockState(pos.below()).isAir()) {
                        BlockPos absolutePos = chunk.getPos().getWorldPosition().offset(pos.getX(), pos.getY(), pos.getZ());
                        world.setBlockAndUpdate(absolutePos, ModBlocks.COLORED_CAVES_PORTAL.get().defaultBlockState());
                        return new Vec3(absolutePos.getX() + 0.5, absolutePos.getY() + 1, absolutePos.getZ() + 0.5);
                    }
                }
            }
        }
        return null;
    }



}