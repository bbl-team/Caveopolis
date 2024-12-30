package com.benbenlaw.caveopolis.network.packet;

import com.benbenlaw.caveopolis.network.payload.PreviousPagePayload;
import com.benbenlaw.caveopolis.screen.WorktableMenu;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class PreviousPagePacket {

    public static final PreviousPagePacket INSTANCE = new PreviousPagePacket();

    public static PreviousPagePacket get() {
        return INSTANCE;
    }

    public void handle(final PreviousPagePayload payload, IPayloadContext context) {

        Player player = context.player();

        if (player.containerMenu instanceof WorktableMenu worktableMenu) {
            worktableMenu.previousPage();
        }



    }
}
