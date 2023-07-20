package com.benbenlaw.caveopolis.block.custom.sign.black;

import com.benbenlaw.caveopolis.block.entity.sign.BlackHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BlackHangingSignBlock extends CeilingHangingSignBlock {
    public BlackHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BlackHangingSignBlockEntity(pos, state);
    }
}
