package com.benbenlaw.caveopolis.block.custom.sign.red;

import com.benbenlaw.caveopolis.block.entity.sign.RedHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class RedWallHangingSignBlock extends WallHangingSignBlock {
    public RedWallHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RedHangingSignBlockEntity(pos, state);
    }
}
