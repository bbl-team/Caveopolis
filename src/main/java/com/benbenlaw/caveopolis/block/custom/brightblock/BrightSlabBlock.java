package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightSlabBlock extends SlabBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightSlabBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(LIT, Boolean.FALSE).setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(false)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, TYPE, WATERLOGGED);
    }

    @Nullable
    @Override
    @javax.annotation.Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_56361_) {
        BlockPos blockpos = p_56361_.getClickedPos();
        BlockState blockstate = p_56361_.getLevel().getBlockState(blockpos);
        if (blockstate.is(this)) {
            return blockstate.setValue(LIT, Boolean.FALSE).setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, Boolean.valueOf(false));
        } else {
            FluidState fluidstate = p_56361_.getLevel().getFluidState(blockpos);
            BlockState blockstate1 = this.defaultBlockState().setValue(TYPE, SlabType.BOTTOM).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
            Direction direction = p_56361_.getClickedFace();
            return direction != Direction.DOWN && (direction == Direction.UP || !(p_56361_.getClickLocation().y - (double)blockpos.getY() > 0.5D)) ? blockstate1 : blockstate1.setValue(TYPE, SlabType.TOP);
        }
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
