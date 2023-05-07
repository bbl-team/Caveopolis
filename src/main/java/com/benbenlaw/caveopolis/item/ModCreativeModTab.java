package com.benbenlaw.caveopolis.item;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab CAVEOPOLIS = new CreativeModeTab("caveopolis") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.STONE_STICK.get());
        }
    };
}
