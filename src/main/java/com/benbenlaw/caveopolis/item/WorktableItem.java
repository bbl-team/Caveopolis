package com.benbenlaw.caveopolis.item;

import com.benbenlaw.caveopolis.screen.WorktableMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.StonecutterMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class WorktableItem extends Item {
    public WorktableItem(Properties properties) {
        super(properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, @NotNull Player player, @NotNull InteractionHand hand) {

        if (!level.isClientSide()) {


            level.getBlockEntity(player.blockPosition());
            player.openMenu(new SimpleMenuProvider(
                    (windowId, playerInventory, playerEntity) -> new WorktableMenu(windowId, playerInventory, player.blockPosition(), null),
                    Component.translatable("item.caveopolis.worktable")), (buf -> buf.writeBlockPos(player.blockPosition())));

        }
        return InteractionResultHolder.fail(player.getItemInHand(hand));
    }

}
