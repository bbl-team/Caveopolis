package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.stream.FactoryConfigurationError;

public class BrightStairBlock extends StairBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final EnumProperty<Half> HALF = BlockStateProperties.HALF;
    public static final EnumProperty<StairsShape> SHAPE = BlockStateProperties.STAIRS_SHAPE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    private static final int[] SHAPE_BY_STATE = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};

    public BrightStairBlock(BlockState p_56862_, Properties p_56863_) {
        super(p_56862_, p_56863_);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE));

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, FACING, HALF, SHAPE, WATERLOGGED);
    }

    @Nullable
    @Override

    public BlockState getStateForPlacement(BlockPlaceContext p_56872_) {
        Direction direction = p_56872_.getClickedFace();
        BlockPos blockpos = p_56872_.getClickedPos();
        FluidState fluidstate = p_56872_.getLevel().getFluidState(blockpos);
        BlockState blockstate = this.defaultBlockState().setValue(FACING, p_56872_.getHorizontalDirection()).setValue(HALF, direction != Direction.DOWN && (direction == Direction.UP || !(p_56872_.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? Half.BOTTOM : Half.TOP).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        return blockstate.setValue(SHAPE, getStairsShape(blockstate, p_56872_.getLevel(), blockpos)).setValue(LIT, Boolean.FALSE);
    }


    private static StairsShape getStairsShape(BlockState p_56977_, BlockGetter p_56978_, BlockPos p_56979_) {
        Direction direction = p_56977_.getValue(FACING);
        BlockState blockstate = p_56978_.getBlockState(p_56979_.relative(direction));
        if (isStairs(blockstate) && p_56977_.getValue(HALF) == blockstate.getValue(HALF)) {
            Direction direction1 = blockstate.getValue(FACING);
            if (direction1.getAxis() != p_56977_.getValue(FACING).getAxis() && canTakeShape(p_56977_, p_56978_, p_56979_, direction1.getOpposite())) {
                if (direction1 == direction.getCounterClockWise()) {
                    return StairsShape.OUTER_LEFT;
                }

                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState blockstate1 = p_56978_.getBlockState(p_56979_.relative(direction.getOpposite()));
        if (isStairs(blockstate1) && p_56977_.getValue(HALF) == blockstate1.getValue(HALF)) {
            Direction direction2 = blockstate1.getValue(FACING);
            if (direction2.getAxis() != p_56977_.getValue(FACING).getAxis() && canTakeShape(p_56977_, p_56978_, p_56979_, direction2)) {
                if (direction2 == direction.getCounterClockWise()) {
                    return StairsShape.INNER_LEFT;
                }

                return StairsShape.INNER_RIGHT;
            }
        }

        return StairsShape.STRAIGHT;
    }

    private static boolean canTakeShape(BlockState p_56971_, BlockGetter p_56972_, BlockPos p_56973_, Direction p_56974_) {
        BlockState blockstate = p_56972_.getBlockState(p_56973_.relative(p_56974_));
        return !isStairs(blockstate) || blockstate.getValue(FACING) != p_56971_.getValue(FACING) || blockstate.getValue(HALF) != p_56971_.getValue(HALF);
    }


    public VoxelShape getShape(BlockState p_56956_, BlockGetter p_56957_, BlockPos p_56958_, CollisionContext p_56959_) {
        return (p_56956_.getValue(HALF) == Half.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_BY_STATE[this.getShapeIndex(p_56956_)]];
    }

    private int getShapeIndex(BlockState p_56983_) {
        return p_56983_.getValue(SHAPE).ordinal() * 4 + p_56983_.getValue(FACING).get2DDataValue();
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
