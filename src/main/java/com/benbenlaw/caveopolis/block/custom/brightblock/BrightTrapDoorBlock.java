package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class BrightTrapDoorBlock extends TrapDoorBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightTrapDoorBlock(Properties properties, BlockSetType type) {
        super(properties, type);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, FACING, OPEN, HALF, POWERED, WATERLOGGED);
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_57533_) {
        BlockState blockstate = this.defaultBlockState();
        FluidState fluidstate = p_57533_.getLevel().getFluidState(p_57533_.getClickedPos());
        Direction direction = p_57533_.getClickedFace();
        if (!p_57533_.replacingClickedOnBlock() && direction.getAxis().isHorizontal()) {
            blockstate = blockstate.setValue(FACING, direction).setValue(HALF, p_57533_.getClickLocation().y - (double)p_57533_.getClickedPos().getY() > 0.5D ? Half.TOP : Half.BOTTOM);
        } else {
            blockstate = blockstate.setValue(FACING, p_57533_.getHorizontalDirection().getOpposite()).setValue(HALF, direction == Direction.UP ? Half.BOTTOM : Half.TOP);
        }

        if (p_57533_.getLevel().hasNeighborSignal(p_57533_.getClickedPos())) {
            blockstate = blockstate.setValue(OPEN, Boolean.valueOf(true)).setValue(POWERED, Boolean.valueOf(true));
        }

        return blockstate.setValue(LIT, Boolean.FALSE).setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    }

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;

    }
}

