package com.benbenlaw.caveopolis.block.custom.sign.light_gray;

import com.benbenlaw.caveopolis.block.entity.sign.LightGraySignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class LightGrayStandingSignBlock extends StandingSignBlock {
    public LightGrayStandingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LightGraySignBlockEntity(pos, state);
    }
}
