package com.benbenlaw.caveopolis.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {

    public static final String KEY_CATEGORY = "Caveopolis";
    public static final String KEY_MASS_SPRAY = "key.caveopolis.mass_spray";

    public static final KeyMapping MASS_SPRAY = new KeyMapping(KEY_MASS_SPRAY, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_S, KEY_CATEGORY);
}
