package com.benbenlaw.caveopolis.block.custom.sign.yellow;

import com.benbenlaw.caveopolis.block.entity.sign.YellowHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class YellowHangingSignBlock extends CeilingHangingSignBlock {
    public YellowHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new YellowHangingSignBlockEntity(pos, state);
    }
}
