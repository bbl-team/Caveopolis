package com.benbenlaw.caveopolis.network.payload;

import com.benbenlaw.caveopolis.Caveopolis;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.ResourceLocation;

public record NextPagePayload(int pageNumber) implements CustomPacketPayload {


    public static final Type<NextPagePayload> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "next_page"));

    @Override
    public Type<NextPagePayload> type() {
        return TYPE;
    }

    public static final StreamCodec<FriendlyByteBuf, NextPagePayload> STREAM_CODEC = StreamCodec.composite(
            ByteBufCodecs.INT, NextPagePayload::pageNumber,
            NextPagePayload::new
    );

}
