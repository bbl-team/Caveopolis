package com.benbenlaw.caveopolis.block.custom.sign.gray;

import com.benbenlaw.caveopolis.block.entity.sign.GrayHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GrayWallHangingSignBlock extends WallHangingSignBlock {
    public GrayWallHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new GrayHangingSignBlockEntity(pos, state);
    }
}
