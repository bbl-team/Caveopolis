package com.benbenlaw.caveopolis.block.entity.sign;

import com.benbenlaw.caveopolis.block.entity.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.HangingSignBlockEntity;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class OrangeHangingSignBlockEntity extends HangingSignBlockEntity {
    public OrangeHangingSignBlockEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return ModBlockEntities.ORANGE_HANGING_SIGN.get();
    }
}
