package com.benbenlaw.caveopolis.integrations.jei;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.ISubtypeRegistration;
import net.minecraft.resources.ResourceLocation;

@JeiPlugin
public class CaveopolisJEI implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(Caveopolis.MOD_ID, "jei_plugin");
    }


    @Override
    public void registerItemSubtypes(ISubtypeRegistration registration) {

        //Colored Stone
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Mosaic
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MOSAIC_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Chaotic
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Triple
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_TRIPLE_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Braid
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRAID_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Encased
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ENCASED_BUTTON.asItem(), new BlockSubtypeInterpreter());

        //Colored Road
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_STAIRS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_SLAB.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_WALL.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_ROAD_BUTTON.asItem(), new BlockSubtypeInterpreter());





        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_FENCE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_DOOR.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_LOG.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_WOOD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.STRIPPED_COLORED_LOG.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.STRIPPED_COLORED_WOOD.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_LEAVES.asItem(), new BlockSubtypeInterpreter());



        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_STONE_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_DIRT.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE.asItem(), new BlockSubtypeInterpreter());
        registration.registerSubtypeInterpreter(CaveopolisBlocks.COLORED_MARBLE_BRICKS.asItem(), new BlockSubtypeInterpreter());
    }
}
