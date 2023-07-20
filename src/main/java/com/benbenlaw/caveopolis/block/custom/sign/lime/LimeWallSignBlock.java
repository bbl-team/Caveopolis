package com.benbenlaw.caveopolis.block.custom.sign.lime;

import com.benbenlaw.caveopolis.block.entity.sign.LimeSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class LimeWallSignBlock extends WallSignBlock {
    public LimeWallSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LimeSignBlockEntity(pos, state);
    }
}
