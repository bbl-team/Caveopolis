package com.benbenlaw.caveopolis.block.custom.sign.green;

import com.benbenlaw.caveopolis.block.entity.sign.GreenSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class GreenStandingSignBlock extends StandingSignBlock {
    public GreenStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new GreenSignBlockEntity(pos, state);
    }
}
