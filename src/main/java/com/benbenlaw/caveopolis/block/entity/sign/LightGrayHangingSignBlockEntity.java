package com.benbenlaw.caveopolis.block.entity.sign;

import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class LightGrayHangingSignBlockEntity extends SignBlockEntity {
    public LightGrayHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.LIGHT_GRAY_HANGING_SIGN.get(), pos, state);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.LIGHT_GRAY_HANGING_SIGN.get();
    }
}
