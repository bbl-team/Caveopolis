package com.benbenlaw.caveopolis.block.custom.sign.purple;

import com.benbenlaw.caveopolis.block.entity.sign.PurpleSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class PurpleWallSignBlock extends WallSignBlock {
    public PurpleWallSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PurpleSignBlockEntity(pos, state);
    }
}
