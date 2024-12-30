package com.benbenlaw.caveopolis.network.packet;

import com.benbenlaw.caveopolis.network.payload.NextPagePayload;
import com.benbenlaw.caveopolis.screen.WorktableMenu;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.network.handling.IPayloadContext;

public class NextPagePacket {

    public static final NextPagePacket INSTANCE = new NextPagePacket();

    public static NextPagePacket get() {
        return INSTANCE;
    }

    public void handle(final NextPagePayload payload, IPayloadContext context) {

        Player player = context.player();

        if (player.containerMenu instanceof WorktableMenu worktableMenu) {
            worktableMenu.nextPage();
        }



    }
}
