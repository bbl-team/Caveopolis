package com.benbenlaw.caveopolis.util;

import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.ColoredLog;
import com.benbenlaw.core.block.flammable.FlammableColoredLog;

public class LogMaps {

    public void updateLogMaps() {

        System.out.println("Updating log maps...");

        ColoredLog.updateLogStrippedMap(CaveopolisBlocks.COLORED_LOG.get(), CaveopolisBlocks.STRIPPED_COLORED_LOG.get());
        ColoredLog.updateWoodStrippedMap(CaveopolisBlocks.COLORED_WOOD.get(), CaveopolisBlocks.STRIPPED_COLORED_WOOD.get());
    }



}
