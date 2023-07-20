package com.benbenlaw.caveopolis.block.custom.sign.brown;

import com.benbenlaw.caveopolis.block.entity.sign.BrownHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class BrownHangingSignBlock extends CeilingHangingSignBlock {
    public BrownHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BrownHangingSignBlockEntity(pos, state);
    }
}
