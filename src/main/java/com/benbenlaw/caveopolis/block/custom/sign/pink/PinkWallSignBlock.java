package com.benbenlaw.caveopolis.block.custom.sign.pink;

import com.benbenlaw.caveopolis.block.entity.sign.PinkSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class PinkWallSignBlock extends WallSignBlock {
    public PinkWallSignBlock(Properties properties, WoodType woodType) {
        super(woodType, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PinkSignBlockEntity(pos, state);
    }
}
