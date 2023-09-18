package com.benbenlaw.caveopolis.block.custom.brightblock;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BrightPressurePlateBlock extends PressurePlateBlock implements Brightable {

    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public BrightPressurePlateBlock(Sensitivity sensitivity, Properties properties, BlockSetType type) {
        super(sensitivity, properties, type);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55484_) {
        p_55484_.add(LIT, POWERED);
    }


    public BlockState getStateForPlacement(BlockPlaceContext p_49820_) {
        return this.defaultBlockState().setValue(LIT, Boolean.FALSE);
    }

    public @NotNull RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;

    }
}

