package com.benbenlaw.caveopolis.block.custom.sign.light_blue;

import com.benbenlaw.caveopolis.block.entity.sign.LightBlueHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class LightBlueWallHangingSignBlock extends WallHangingSignBlock {
    public LightBlueWallHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LightBlueHangingSignBlockEntity(pos, state);
    }
}
