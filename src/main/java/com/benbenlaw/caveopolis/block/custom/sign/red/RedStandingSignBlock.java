package com.benbenlaw.caveopolis.block.custom.sign.red;

import com.benbenlaw.caveopolis.block.entity.sign.RedSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class RedStandingSignBlock extends StandingSignBlock {
    public RedStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RedSignBlockEntity(pos, state);
    }
}
