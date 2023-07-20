package com.benbenlaw.caveopolis.block.custom.sign.blue;

import com.benbenlaw.caveopolis.block.entity.sign.BlueSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlueStandingSignBlock extends StandingSignBlock {
    public BlueStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlueSignBlockEntity(pos, state);
    }
}
