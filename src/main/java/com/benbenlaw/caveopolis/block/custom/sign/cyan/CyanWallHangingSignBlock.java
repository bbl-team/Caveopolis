package com.benbenlaw.caveopolis.block.custom.sign.cyan;

import com.benbenlaw.caveopolis.block.entity.sign.CyanHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CyanWallHangingSignBlock extends WallHangingSignBlock {
    public CyanWallHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CyanHangingSignBlockEntity(pos, state);
    }
}
