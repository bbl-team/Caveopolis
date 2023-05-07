package com.benbenlaw.caveopolis.block.crafting_table;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;

public class StoneCraftingTableBlock extends CraftingTableBlock {
    public StoneCraftingTableBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos blockPos) {
        return new SimpleMenuProvider((id, inventory, entity) ->
                new StoneCraftingTableMenu(id, inventory, ContainerLevelAccess.create(level, blockPos), this),
                Component.translatable("gui.caveopolis.stone_crafting_table"));
    }

}
