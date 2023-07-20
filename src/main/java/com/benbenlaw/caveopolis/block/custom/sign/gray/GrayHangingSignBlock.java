package com.benbenlaw.caveopolis.block.custom.sign.gray;

import com.benbenlaw.caveopolis.block.entity.sign.GrayHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GrayHangingSignBlock extends CeilingHangingSignBlock {
    public GrayHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new GrayHangingSignBlockEntity(pos, state);
    }
}
