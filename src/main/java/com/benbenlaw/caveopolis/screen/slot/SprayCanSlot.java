package com.benbenlaw.caveopolis.screen.slot;

import com.benbenlaw.caveopolis.util.ModTags;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SprayCanSlot extends SlotItemHandler {
    public SprayCanSlot(IItemHandler itemHandler, int index, int x, int y) {
        super(itemHandler, index, x, y);
    }

    @Override
    public boolean mayPlace(ItemStack stack) {
        return stack.is(ModTags.Items.SPRAY_CANS);
    }


}