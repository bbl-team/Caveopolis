package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightLeavesBlock extends LeavesBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightLeavesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE).setValue(DISTANCE, Integer.valueOf(7)).setValue(PERSISTENT, Boolean.valueOf(false)).setValue(WATERLOGGED, Boolean.valueOf(false)));

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, DISTANCE, PERSISTENT, WATERLOGGED);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        FluidState fluidstate = pContext.getLevel().getFluidState(pContext.getClickedPos());
        BlockState blockstate = this.defaultBlockState().setValue(LIT, false).setValue(PERSISTENT, Boolean.valueOf(true)).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
        return updateDistance(blockstate, pContext.getLevel(), pContext.getClickedPos());
    }

    private static BlockState updateDistance(BlockState p_54436_, LevelAccessor p_54437_, BlockPos p_54438_) {
        int i = 7;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();

        for(Direction direction : Direction.values()) {
            blockpos$mutableblockpos.setWithOffset(p_54438_, direction);
            i = Math.min(i, getDistanceAt(p_54437_.getBlockState(blockpos$mutableblockpos)) + 1);
            if (i == 1) {
                break;
            }
        }

        return p_54436_.setValue(DISTANCE, Integer.valueOf(i));
    }

    private static int getDistanceAt(BlockState p_54464_) {
        return getOptionalDistanceAt(p_54464_).orElse(7);
    }

    @Override
    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }


}
