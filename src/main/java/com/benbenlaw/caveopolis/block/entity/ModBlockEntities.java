package com.benbenlaw.caveopolis.block.entity;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.ModBlocks;
import com.benbenlaw.caveopolis.block.entity.sign.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Caveopolis.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<ColoredCavesPortalBlockEntity>> COLORED_CAVES_PORTAL_BLOCK_ENTITY =
            register("colored_caves_portal_block_entity", () ->
                    BlockEntityType.Builder.of(ColoredCavesPortalBlockEntity::new, ModBlocks.COLORED_CAVES_PORTAL.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<SprayerBlockEntity>> SPRAYER =
            register("sprayer", () ->
                    BlockEntityType.Builder.of(SprayerBlockEntity::new,
                            ModBlocks.SPRAYER.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlackSignBlockEntity>> BLACK_SIGN =
            register("black_sign", () ->
                    BlockEntityType.Builder.of(BlackSignBlockEntity::new,
                            ModBlocks.BLACK_COLORED_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_SIGN.get()));
    
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlackHangingSignBlockEntity>> BLACK_HANGING_SIGN =
            register("black_hanging_sign", () ->
                    BlockEntityType.Builder.of(BlackHangingSignBlockEntity::new,
                            ModBlocks.BLACK_COLORED_HANGING_SIGN.get(), ModBlocks.BLACK_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlueSignBlockEntity>> BLUE_SIGN =
            register("blue_sign", () ->
                    BlockEntityType.Builder.of(BlueSignBlockEntity::new,
                            ModBlocks.BLUE_COLORED_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BlueHangingSignBlockEntity>> BLUE_HANGING_SIGN =
            register("blue_hanging_sign", () ->
                    BlockEntityType.Builder.of(BlueHangingSignBlockEntity::new,
                            ModBlocks.BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.BLUE_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrownSignBlockEntity>> BROWN_SIGN =
            register("brown_sign", () ->
                    BlockEntityType.Builder.of(BrownSignBlockEntity::new,
                            ModBlocks.BROWN_COLORED_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<BrownHangingSignBlockEntity>> BROWN_HANGING_SIGN =
            register("brown_hanging_sign", () ->
                    BlockEntityType.Builder.of(BrownHangingSignBlockEntity::new,
                            ModBlocks.BROWN_COLORED_HANGING_SIGN.get(), ModBlocks.BROWN_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CyanSignBlockEntity>> CYAN_SIGN =
            register("cyan_sign", () ->
                    BlockEntityType.Builder.of(CyanSignBlockEntity::new,
                            ModBlocks.CYAN_COLORED_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<CyanHangingSignBlockEntity>> CYAN_HANGING_SIGN =
            register("cyan_hanging_sign", () ->
                    BlockEntityType.Builder.of(CyanHangingSignBlockEntity::new,
                            ModBlocks.CYAN_COLORED_HANGING_SIGN.get(), ModBlocks.CYAN_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GraySignBlockEntity>> GRAY_SIGN =
            register("gray_sign", () ->
                    BlockEntityType.Builder.of(GraySignBlockEntity::new,
                            ModBlocks.GRAY_COLORED_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GrayHangingSignBlockEntity>> GRAY_HANGING_SIGN =
            register("gray_hanging_sign", () ->
                    BlockEntityType.Builder.of(GrayHangingSignBlockEntity::new,
                            ModBlocks.GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.GRAY_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GreenSignBlockEntity>> GREEN_SIGN =
            register("green_sign", () ->
                    BlockEntityType.Builder.of(GreenSignBlockEntity::new,
                            ModBlocks.GREEN_COLORED_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<GreenHangingSignBlockEntity>> GREEN_HANGING_SIGN =
            register("green_hanging_sign", () ->
                    BlockEntityType.Builder.of(GreenHangingSignBlockEntity::new,
                            ModBlocks.GREEN_COLORED_HANGING_SIGN.get(), ModBlocks.GREEN_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LightBlueSignBlockEntity>> LIGHT_BLUE_SIGN =
            register("light_blue_sign", () ->
                    BlockEntityType.Builder.of(LightBlueSignBlockEntity::new,
                            ModBlocks.LIGHT_BLUE_COLORED_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LightBlueHangingSignBlockEntity>> LIGHT_BLUE_HANGING_SIGN =
            register("light_blue_hanging_sign", () ->
                    BlockEntityType.Builder.of(LightBlueHangingSignBlockEntity::new,
                            ModBlocks.LIGHT_BLUE_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_BLUE_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LightGraySignBlockEntity>> LIGHT_GRAY_SIGN =
            register("light_gray_sign", () ->
                    BlockEntityType.Builder.of(LightGraySignBlockEntity::new,
                            ModBlocks.LIGHT_GRAY_COLORED_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LightGrayHangingSignBlockEntity>> LIGHT_GRAY_HANGING_SIGN =
            register("light_gray_hanging_sign", () ->
                    BlockEntityType.Builder.of(LightGrayHangingSignBlockEntity::new,
                            ModBlocks.LIGHT_GRAY_COLORED_HANGING_SIGN.get(), ModBlocks.LIGHT_GRAY_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LimeSignBlockEntity>> LIME_SIGN =
            register("lime_sign", () ->
                    BlockEntityType.Builder.of(LimeSignBlockEntity::new,
                            ModBlocks.LIME_COLORED_SIGN.get(), ModBlocks.LIME_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<LimeHangingSignBlockEntity>> LIME_HANGING_SIGN =
            register("lime_hanging_sign", () ->
                    BlockEntityType.Builder.of(LimeHangingSignBlockEntity::new,
                            ModBlocks.LIME_COLORED_HANGING_SIGN.get(), ModBlocks.LIME_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MagentaSignBlockEntity>> MAGENTA_SIGN =
            register("magenta_sign", () ->
                    BlockEntityType.Builder.of(MagentaSignBlockEntity::new,
                            ModBlocks.MAGENTA_COLORED_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<MagentaHangingSignBlockEntity>> MAGENTA_HANGING_SIGN =
            register("magenta_hanging_sign", () ->
                    BlockEntityType.Builder.of(MagentaHangingSignBlockEntity::new,
                            ModBlocks.MAGENTA_COLORED_HANGING_SIGN.get(), ModBlocks.MAGENTA_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OrangeSignBlockEntity>> ORANGE_SIGN =
            register("orange_sign", () ->
                    BlockEntityType.Builder.of(OrangeSignBlockEntity::new,
                            ModBlocks.ORANGE_COLORED_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<OrangeHangingSignBlockEntity>> ORANGE_HANGING_SIGN =
            register("orange_hanging_sign", () ->
                    BlockEntityType.Builder.of(OrangeHangingSignBlockEntity::new,
                            ModBlocks.ORANGE_COLORED_HANGING_SIGN.get(), ModBlocks.ORANGE_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PinkSignBlockEntity>> PINK_SIGN =
            register("pink_sign", () ->
                    BlockEntityType.Builder.of(PinkSignBlockEntity::new,
                            ModBlocks.PINK_COLORED_SIGN.get(), ModBlocks.PINK_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PinkHangingSignBlockEntity>> PINK_HANGING_SIGN =
            register("pink_hanging_sign", () ->
                    BlockEntityType.Builder.of(PinkHangingSignBlockEntity::new,
                            ModBlocks.PINK_COLORED_HANGING_SIGN.get(), ModBlocks.PINK_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PurpleSignBlockEntity>> PURPLE_SIGN =
            register("purple_sign", () ->
                    BlockEntityType.Builder.of(PurpleSignBlockEntity::new,
                            ModBlocks.PURPLE_COLORED_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<PurpleHangingSignBlockEntity>> PURPLE_HANGING_SIGN =
            register("purple_hanging_sign", () ->
                    BlockEntityType.Builder.of(PurpleHangingSignBlockEntity::new,
                            ModBlocks.PURPLE_COLORED_HANGING_SIGN.get(), ModBlocks.PURPLE_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedSignBlockEntity>> RED_SIGN =
            register("red_sign", () ->
                    BlockEntityType.Builder.of(RedSignBlockEntity::new,
                            ModBlocks.RED_COLORED_SIGN.get(), ModBlocks.RED_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<RedHangingSignBlockEntity>> RED_HANGING_SIGN =
            register("red_hanging_sign", () ->
                    BlockEntityType.Builder.of(RedHangingSignBlockEntity::new,
                            ModBlocks.RED_COLORED_HANGING_SIGN.get(), ModBlocks.RED_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WhiteSignBlockEntity>> WHITE_SIGN =
            register("white_sign", () ->
                    BlockEntityType.Builder.of(WhiteSignBlockEntity::new,
                            ModBlocks.WHITE_COLORED_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<WhiteHangingSignBlockEntity>> WHITE_HANGING_SIGN =
            register("white_hanging_sign", () ->
                    BlockEntityType.Builder.of(WhiteHangingSignBlockEntity::new,
                            ModBlocks.WHITE_COLORED_HANGING_SIGN.get(), ModBlocks.WHITE_COLORED_WALL_HANGING_SIGN.get()));

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<YellowSignBlockEntity>> YELLOW_SIGN =
            register("yellow_sign", () ->
                    BlockEntityType.Builder.of(YellowSignBlockEntity::new,
                            ModBlocks.YELLOW_COLORED_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_SIGN.get()));
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<YellowHangingSignBlockEntity>> YELLOW_HANGING_SIGN =
            register("yellow_hanging_sign", () ->
                    BlockEntityType.Builder.of(YellowHangingSignBlockEntity::new,
                            ModBlocks.YELLOW_COLORED_HANGING_SIGN.get(), ModBlocks.YELLOW_COLORED_WALL_HANGING_SIGN.get()));


    //Capability Registration (Item Handler)]
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK,
                ModBlockEntities.SPRAYER.get(), SprayerBlockEntity::getItemHandlerCapability);
    }


    public static <T extends BlockEntity> DeferredHolder<BlockEntityType<?>, BlockEntityType<T>> register(@Nonnull String name, @Nonnull Supplier<BlockEntityType.Builder<T>> initializer) {
        return BLOCK_ENTITIES.register(name, () -> initializer.get().build(null));
    }
    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }


}
