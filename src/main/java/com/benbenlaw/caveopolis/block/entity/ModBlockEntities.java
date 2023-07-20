package com.benbenlaw.caveopolis.block.entity;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.entity.sign.*;
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

    public static final RegistryObject<BlockEntityType<BlackSignBlockEntity>> BLACK_SIGN =
            BLOCK_ENTITIES.register("black_sign", () ->
                    BlockEntityType.Builder.of(BlackSignBlockEntity::new,
                            ModBlocks.BLACK_COLORED_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlackHangingSignBlockEntity>> BLACK_HANGING_SIGN =
            BLOCK_ENTITIES.register("black_hanging_sign", () ->
                    BlockEntityType.Builder.of(BlackHangingSignBlockEntity::new,
                            ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BlueSignBlockEntity>> BLUE_SIGN =
            BLOCK_ENTITIES.register("blue_sign", () ->
                    BlockEntityType.Builder.of(BlueSignBlockEntity::new,
                            ModBlocks.BLUE_COLORED_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<BlueHangingSignBlockEntity>> BLUE_HANGING_SIGN =
            BLOCK_ENTITIES.register("blue_hanging_sign", () ->
                    BlockEntityType.Builder.of(BlueHangingSignBlockEntity::new,
                            ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<BrownSignBlockEntity>> BROWN_SIGN =
            BLOCK_ENTITIES.register("brown_sign", () ->
                    BlockEntityType.Builder.of(BrownSignBlockEntity::new,
                            ModBlocks.BROWN_COLORED_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<BrownHangingSignBlockEntity>> BROWN_HANGING_SIGN =
            BLOCK_ENTITIES.register("brown_hanging_sign", () ->
                    BlockEntityType.Builder.of(BrownHangingSignBlockEntity::new,
                            ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<CyanSignBlockEntity>> CYAN_SIGN =
            BLOCK_ENTITIES.register("cyan_sign", () ->
                    BlockEntityType.Builder.of(CyanSignBlockEntity::new,
                            ModBlocks.CYAN_COLORED_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<CyanHangingSignBlockEntity>> CYAN_HANGING_SIGN =
            BLOCK_ENTITIES.register("cyan_hanging_sign", () ->
                    BlockEntityType.Builder.of(CyanHangingSignBlockEntity::new,
                            ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<GraySignBlockEntity>> GRAY_SIGN =
            BLOCK_ENTITIES.register("gray_sign", () ->
                    BlockEntityType.Builder.of(GraySignBlockEntity::new,
                            ModBlocks.GRAY_COLORED_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<GrayHangingSignBlockEntity>> GRAY_HANGING_SIGN =
            BLOCK_ENTITIES.register("gray_hanging_sign", () ->
                    BlockEntityType.Builder.of(GrayHangingSignBlockEntity::new,
                            ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<GreenSignBlockEntity>> GREEN_SIGN =
            BLOCK_ENTITIES.register("green_sign", () ->
                    BlockEntityType.Builder.of(GreenSignBlockEntity::new,
                            ModBlocks.GREEN_COLORED_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<GreenHangingSignBlockEntity>> GREEN_HANGING_SIGN =
            BLOCK_ENTITIES.register("green_hanging_sign", () ->
                    BlockEntityType.Builder.of(GreenHangingSignBlockEntity::new,
                            ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<LightBlueSignBlockEntity>> LIGHT_BLUE_SIGN =
            BLOCK_ENTITIES.register("light_blue_sign", () ->
                    BlockEntityType.Builder.of(LightBlueSignBlockEntity::new,
                            ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightBlueHangingSignBlockEntity>> LIGHT_BLUE_HANGING_SIGN =
            BLOCK_ENTITIES.register("light_blue_hanging_sign", () ->
                    BlockEntityType.Builder.of(LightBlueHangingSignBlockEntity::new,
                            ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<LightGraySignBlockEntity>> LIGHT_GRAY_SIGN =
            BLOCK_ENTITIES.register("light_gray_sign", () ->
                    BlockEntityType.Builder.of(LightGraySignBlockEntity::new,
                            ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<LightGrayHangingSignBlockEntity>> LIGHT_GRAY_HANGING_SIGN =
            BLOCK_ENTITIES.register("light_gray_hanging_sign", () ->
                    BlockEntityType.Builder.of(LightGrayHangingSignBlockEntity::new,
                            ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<LimeSignBlockEntity>> LIME_SIGN =
            BLOCK_ENTITIES.register("lime_sign", () ->
                    BlockEntityType.Builder.of(LimeSignBlockEntity::new,
                            ModBlocks.LIME_COLORED_SIGN.get(), ModBlocks.LIME_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<LimeHangingSignBlockEntity>> LIME_HANGING_SIGN =
            BLOCK_ENTITIES.register("lime_hanging_sign", () ->
                    BlockEntityType.Builder.of(LimeHangingSignBlockEntity::new,
                            ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.LIME_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<MagentaSignBlockEntity>> MAGENTA_SIGN =
            BLOCK_ENTITIES.register("magenta_sign", () ->
                    BlockEntityType.Builder.of(MagentaSignBlockEntity::new,
                            ModBlocks.MAGENTA_COLORED_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<MagentaHangingSignBlockEntity>> MAGENTA_HANGING_SIGN =
            BLOCK_ENTITIES.register("magenta_hanging_sign", () ->
                    BlockEntityType.Builder.of(MagentaHangingSignBlockEntity::new,
                            ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<OrangeSignBlockEntity>> ORANGE_SIGN =
            BLOCK_ENTITIES.register("orange_sign", () ->
                    BlockEntityType.Builder.of(OrangeSignBlockEntity::new,
                            ModBlocks.ORANGE_COLORED_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<OrangeHangingSignBlockEntity>> ORANGE_HANGING_SIGN =
            BLOCK_ENTITIES.register("orange_hanging_sign", () ->
                    BlockEntityType.Builder.of(OrangeHangingSignBlockEntity::new,
                            ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<PinkSignBlockEntity>> PINK_SIGN =
            BLOCK_ENTITIES.register("pink_sign", () ->
                    BlockEntityType.Builder.of(PinkSignBlockEntity::new,
                            ModBlocks.PINK_COLORED_SIGN.get(), ModBlocks.PINK_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<PinkHangingSignBlockEntity>> PINK_HANGING_SIGN =
            BLOCK_ENTITIES.register("pink_hanging_sign", () ->
                    BlockEntityType.Builder.of(PinkHangingSignBlockEntity::new,
                            ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.PINK_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<PurpleSignBlockEntity>> PURPLE_SIGN =
            BLOCK_ENTITIES.register("purple_sign", () ->
                    BlockEntityType.Builder.of(PurpleSignBlockEntity::new,
                            ModBlocks.PURPLE_COLORED_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<PurpleHangingSignBlockEntity>> PURPLE_HANGING_SIGN =
            BLOCK_ENTITIES.register("purple_hanging_sign", () ->
                    BlockEntityType.Builder.of(PurpleHangingSignBlockEntity::new,
                            ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<RedSignBlockEntity>> RED_SIGN =
            BLOCK_ENTITIES.register("red_sign", () ->
                    BlockEntityType.Builder.of(RedSignBlockEntity::new,
                            ModBlocks.RED_COLORED_SIGN.get(), ModBlocks.RED_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<RedHangingSignBlockEntity>> RED_HANGING_SIGN =
            BLOCK_ENTITIES.register("red_hanging_sign", () ->
                    BlockEntityType.Builder.of(RedHangingSignBlockEntity::new,
                            ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.RED_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<WhiteSignBlockEntity>> WHITE_SIGN =
            BLOCK_ENTITIES.register("white_sign", () ->
                    BlockEntityType.Builder.of(WhiteSignBlockEntity::new,
                            ModBlocks.WHITE_COLORED_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<WhiteHangingSignBlockEntity>> WHITE_HANGING_SIGN =
            BLOCK_ENTITIES.register("white_hanging_sign", () ->
                    BlockEntityType.Builder.of(WhiteHangingSignBlockEntity::new,
                            ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_HANGING_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<YellowSignBlockEntity>> YELLOW_SIGN =
            BLOCK_ENTITIES.register("yellow_sign", () ->
                    BlockEntityType.Builder.of(YellowSignBlockEntity::new,
                            ModBlocks.YELLOW_COLORED_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_SIGN.get()).build(null));
    public static final RegistryObject<BlockEntityType<YellowHangingSignBlockEntity>> YELLOW_HANGING_SIGN =
            BLOCK_ENTITIES.register("yellow_hanging_sign", () ->
                    BlockEntityType.Builder.of(YellowHangingSignBlockEntity::new,
                            ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_HANGING_SIGN.get()).build(null));






    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
