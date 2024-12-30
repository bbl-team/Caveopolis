package com.benbenlaw.caveopolis.network.payload;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record PreviousPagePayload(int pageNumber) implements CustomPacketPayload {


    public static final Type<PreviousPagePayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "previous_page"));

    @Override
    public Type<PreviousPagePayload> type() {
        return TYPE;
    }

    public static final StreamCodec<FriendlyByteBuf, PreviousPagePayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT, PreviousPagePayload::pageNumber,
            PreviousPagePayload::new
    );

}
