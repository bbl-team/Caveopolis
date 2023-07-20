package com.benbenlaw.caveopolis.block.custom.sign.gray;

import com.benbenlaw.caveopolis.block.entity.sign.GraySignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GrayStandingSignBlock extends StandingSignBlock {
    public GrayStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new GraySignBlockEntity(pos, state);
    }
}
