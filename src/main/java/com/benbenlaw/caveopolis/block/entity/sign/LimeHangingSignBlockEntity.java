package com.benbenlaw.caveopolis.block.entity.sign;

import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LimeHangingSignBlockEntity extends HangingSignBlockEntity {
    public LimeHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.LIME_HANGING_SIGN.get();
    }
}
