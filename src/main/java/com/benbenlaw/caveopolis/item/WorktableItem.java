package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.screen.WorktableMenu;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class WorktableItem extends Item {
    public WorktableItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand hand) {

        if (!level.isClientSide()) {


            level.getBlockEntity(player.blockPosition());
            player.openMenu(new SimpleMenuProvider(
                    (windowId, playerInventory, playerEntity) -> new WorktableMenu(windowId, playerInventory, ContainerLevelAccess.create(level, player.blockPosition())),
                    Component.translatable("item.caveopolis.worktable")), (buf -> buf.writeBlockPos(player.blockPosition())));

        }
        return InteractionResultHolder.fail(player.getItemInHand(hand));
    }

}
