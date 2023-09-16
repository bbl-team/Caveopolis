package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightFenceGateBlock extends FenceGateBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightFenceGateBlock(Properties properties, net.minecraft.sounds.SoundEvent openSound, net.minecraft.sounds.SoundEvent closeSound) {
        super(properties, openSound, closeSound);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE).setValue(OPEN, Boolean.valueOf(false)).setValue(POWERED, Boolean.valueOf(false)).setValue(IN_WALL, Boolean.valueOf(false)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53334_) {
        p_53334_.add(LIT, FACING, OPEN, POWERED, IN_WALL);
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_53358_) {
        Level level = p_53358_.getLevel();
        BlockPos blockpos = p_53358_.getClickedPos();
        boolean flag = level.hasNeighborSignal(blockpos);
        Direction direction = p_53358_.getHorizontalDirection();
        Direction.Axis direction$axis = direction.getAxis();
        boolean flag1 = direction$axis == Direction.Axis.Z && (this.isWall(level.getBlockState(blockpos.west())) || this.isWall(level.getBlockState(blockpos.east()))) || direction$axis == Direction.Axis.X && (this.isWall(level.getBlockState(blockpos.north())) || this.isWall(level.getBlockState(blockpos.south())));
        return this.defaultBlockState().setValue(LIT, Boolean.FALSE).setValue(FACING, direction).setValue(OPEN, Boolean.valueOf(flag)).setValue(POWERED, Boolean.valueOf(flag)).setValue(IN_WALL, Boolean.valueOf(flag1));
    }

    private boolean isWall(BlockState p_53405_) {
        return p_53405_.is(BlockTags.WALLS);
    }
    @Override
    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
