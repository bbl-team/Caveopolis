package com.benbenlaw.caveopolis.item.custom;

import com.benbenlaw.caveopolis.item.ModCreativeModTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class CoalFragment extends Item {

    final boolean hasBurnTime;

    public CoalFragment(boolean burnTime) {
        super(new Properties().tab(ModCreativeModTab.CAVEOPOLIS));

        this.hasBurnTime = burnTime;

    }
    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> type) {
        if(this.hasBurnTime == true) {
            return 200;
        }

        return -1;
    }
}
