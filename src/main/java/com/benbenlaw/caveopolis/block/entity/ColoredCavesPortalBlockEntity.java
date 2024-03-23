package com.benbenlaw.caveopolis.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ColoredCavesPortalBlockEntity extends BlockEntity{

    public ColoredCavesPortalBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.COLORED_CAVES_PORTAL_BLOCK_ENTITY.get(), pos, state);
    }

    public void tick() {
    };

}
