package com.benbenlaw.caveopolis.block.custom.sign.cyan;

import com.benbenlaw.caveopolis.block.entity.sign.CyanSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class CyanStandingSignBlock extends StandingSignBlock {
    public CyanStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CyanSignBlockEntity(pos, state);
    }
}
