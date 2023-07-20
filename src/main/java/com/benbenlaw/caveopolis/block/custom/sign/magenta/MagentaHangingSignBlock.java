package com.benbenlaw.caveopolis.block.custom.sign.magenta;

import com.benbenlaw.caveopolis.block.entity.sign.MagentaHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class MagentaHangingSignBlock extends CeilingHangingSignBlock {
    public MagentaHangingSignBlock(Properties properties, WoodType woodType) {
        super(properties, woodType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MagentaHangingSignBlockEntity(pos, state);
    }
}
