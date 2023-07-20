package com.benbenlaw.caveopolis.block.custom.sign.pink;

import com.benbenlaw.caveopolis.block.entity.sign.PinkSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class PinkStandingSignBlock extends StandingSignBlock {
    public PinkStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PinkSignBlockEntity(pos, state);
    }
}
