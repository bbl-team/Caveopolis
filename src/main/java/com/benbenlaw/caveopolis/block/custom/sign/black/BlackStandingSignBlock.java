package com.benbenlaw.caveopolis.block.custom.sign.black;

import com.benbenlaw.caveopolis.block.entity.sign.BlackSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlackStandingSignBlock extends StandingSignBlock {
    public BlackStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlackSignBlockEntity(pos, state);
    }
}
