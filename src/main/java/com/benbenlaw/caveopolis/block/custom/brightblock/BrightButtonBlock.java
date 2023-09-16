package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightButtonBlock extends ButtonBlock {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightButtonBlock(Properties properties, BlockSetType type, int delay, boolean arrowActivated) {
        super(properties, type, delay, arrowActivated);
        this.registerDefaultState(this.stateDefinition.any().setValue(LIT, Boolean.FALSE).setValue(FACING, Direction.NORTH).setValue(POWERED, Boolean.valueOf(false)).setValue(FACE, AttachFace.WALL));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51101_) {
        p_51101_.add(LIT, FACING, POWERED, FACE);
    }

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

}
