package com.benbenlaw.caveopolis.block.entity;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Caveopolis.MOD_ID);

    public static final RegistryObject<BlockEntityType<SprayerBlockEntity>> SPRAYER =
            BLOCK_ENTITIES.register("block_breaker_block_entity", () ->
                    BlockEntityType.Builder.of(SprayerBlockEntity::new,
                            ModBlocks.SPRAYER.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
