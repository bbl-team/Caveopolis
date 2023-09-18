package com.benbenlaw.caveopolis.block.custom.brightblock;

import com.google.common.collect.ImmutableMap;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class BrightWallBlock extends WallBlock implements Brightable {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;


    public BrightWallBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(LIT, Boolean.FALSE));
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_58032_) {
        p_58032_.add(LIT, UP, NORTH_WALL, EAST_WALL, WEST_WALL, SOUTH_WALL, WATERLOGGED);
    }

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public VoxelShape getShape(BlockState p_58050_, BlockGetter p_58051_, BlockPos p_58052_, CollisionContext p_58053_) {
        return super.getShape(p_58050_.setValue(LIT, true), p_58051_, p_58052_, p_58053_);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState p_58055_, BlockGetter p_58056_, BlockPos p_58057_, CollisionContext p_58058_) {
        return super.getCollisionShape(p_58055_.setValue(LIT, true), p_58056_, p_58057_, p_58058_);
    }
}
