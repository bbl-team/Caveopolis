package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import org.jetbrains.annotations.NotNull;

public class BrightWallBlock extends WallBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final BooleanProperty UP = BlockStateProperties.UP;
    public static final EnumProperty<WallSide> EAST_WALL = BlockStateProperties.EAST_WALL;
    public static final EnumProperty<WallSide> NORTH_WALL = BlockStateProperties.NORTH_WALL;
    public static final EnumProperty<WallSide> SOUTH_WALL = BlockStateProperties.SOUTH_WALL;
    public static final EnumProperty<WallSide> WEST_WALL = BlockStateProperties.WEST_WALL;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public BrightWallBlock(Properties properties) {
        super(properties);
        registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE).setValue(UP, Boolean.TRUE).setValue(NORTH_WALL, WallSide.NONE).setValue(EAST_WALL, WallSide.NONE).setValue(SOUTH_WALL, WallSide.NONE).setValue(WEST_WALL, WallSide.NONE).setValue(WATERLOGGED, Boolean.FALSE));

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, UP, NORTH_WALL, EAST_WALL, WEST_WALL, SOUTH_WALL, WATERLOGGED);
    }

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
