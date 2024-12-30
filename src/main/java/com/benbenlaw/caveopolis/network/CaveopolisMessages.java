package com.benbenlaw.caveopolis.network;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.network.packet.NextPagePacket;
import com.benbenlaw.caveopolis.network.packet.PreviousPagePacket;
import com.benbenlaw.caveopolis.network.payload.NextPagePayload;
import com.benbenlaw.caveopolis.network.payload.PreviousPagePayload;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

public class CaveopolisMessages {

    public static void registerNetworking(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(Caveopolis.MOD_ID);

        //To Server From Client
        registrar.playToServer(NextPagePayload.TYPE, NextPagePayload.STREAM_CODEC, NextPagePacket.get()::handle);
        registrar.playToServer(PreviousPagePayload.TYPE, PreviousPagePayload.STREAM_CODEC, PreviousPagePacket.get()::handle);

    }
}
