package com.benbenlaw.caveopolis.data;

import com.benbenlaw.caveopolis.Caveopolis;
import com.benbenlaw.caveopolis.block.CaveopolisBlocks;
import com.benbenlaw.core.block.colored.ColoredDoor;
import com.benbenlaw.core.block.colored.ColoredFence;
import com.benbenlaw.core.block.colored.ColoredStairs;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.*;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.Map;

public class CaveopolisBlockStatesProvider extends BlockStateProvider {

    public CaveopolisBlockStatesProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Caveopolis.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //Colored Stone
        blockWithItem(CaveopolisBlocks.COLORED_STONE);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_STONE_SLAB.get(), CaveopolisBlocks.COLORED_STONE.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_STONE_STAIRS.get(), CaveopolisBlocks.COLORED_STONE.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_STONE_WALL.get(), CaveopolisBlocks.COLORED_STONE.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_STONE_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_STONE.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_STONE_BUTTON.get(), CaveopolisBlocks.COLORED_STONE.get());

        //Colored Mosaic
        blockWithItem(CaveopolisBlocks.COLORED_MOSAIC);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_MOSAIC_SLAB.get(), CaveopolisBlocks.COLORED_MOSAIC.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_MOSAIC_STAIRS.get(), CaveopolisBlocks.COLORED_MOSAIC.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_MOSAIC_WALL.get(), CaveopolisBlocks.COLORED_MOSAIC.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_MOSAIC_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_MOSAIC.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_MOSAIC_BUTTON.get(), CaveopolisBlocks.COLORED_MOSAIC.get());

        //Colored Chaotic
        blockWithItem(CaveopolisBlocks.COLORED_CHAOTIC);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_CHAOTIC_SLAB.get(), CaveopolisBlocks.COLORED_CHAOTIC.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_CHAOTIC_STAIRS.get(), CaveopolisBlocks.COLORED_CHAOTIC.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_CHAOTIC_WALL.get(), CaveopolisBlocks.COLORED_CHAOTIC.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_CHAOTIC_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_CHAOTIC.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_CHAOTIC_BUTTON.get(), CaveopolisBlocks.COLORED_CHAOTIC.get());

        //Colored Triple
        blockWithItem(CaveopolisBlocks.COLORED_TRIPLE);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_TRIPLE_SLAB.get(), CaveopolisBlocks.COLORED_TRIPLE.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_TRIPLE_STAIRS.get(), CaveopolisBlocks.COLORED_TRIPLE.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_TRIPLE_WALL.get(), CaveopolisBlocks.COLORED_TRIPLE.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_TRIPLE_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_TRIPLE.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_TRIPLE_BUTTON.get(), CaveopolisBlocks.COLORED_TRIPLE.get());

        //Colored Braid
        blockWithItem(CaveopolisBlocks.COLORED_BRAID);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_BRAID_SLAB.get(), CaveopolisBlocks.COLORED_BRAID.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_BRAID_STAIRS.get(), CaveopolisBlocks.COLORED_BRAID.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_BRAID_WALL.get(), CaveopolisBlocks.COLORED_BRAID.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_BRAID_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_BRAID.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_BRAID_BUTTON.get(), CaveopolisBlocks.COLORED_BRAID.get());

        //Colored Encased
        blockWithItem(CaveopolisBlocks.COLORED_ENCASED);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_ENCASED_SLAB.get(), CaveopolisBlocks.COLORED_ENCASED.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_ENCASED_STAIRS.get(), CaveopolisBlocks.COLORED_ENCASED.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_ENCASED_WALL.get(), CaveopolisBlocks.COLORED_ENCASED.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_ENCASED_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_ENCASED.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_ENCASED_BUTTON.get(), CaveopolisBlocks.COLORED_ENCASED.get());

        //Colored Road
        blockWithItem(CaveopolisBlocks.COLORED_ROAD);
        slabWithElements((SlabBlock) CaveopolisBlocks.COLORED_ROAD_SLAB.get(), CaveopolisBlocks.COLORED_ROAD.get());
        stairsWithElements((StairBlock) CaveopolisBlocks.COLORED_ROAD_STAIRS.get(), CaveopolisBlocks.COLORED_ROAD.get());
        wallWithElements((WallBlock) CaveopolisBlocks.COLORED_ROAD_WALL.get(), CaveopolisBlocks.COLORED_ROAD.get());
        pressurePlateWithElements((PressurePlateBlock) CaveopolisBlocks.COLORED_ROAD_PRESSURE_PLATE.get(), CaveopolisBlocks.COLORED_ROAD.get());
        buttonWithElements((ButtonBlock) CaveopolisBlocks.COLORED_ROAD_BUTTON.get(), CaveopolisBlocks.COLORED_ROAD.get());



        //Colored Wood
        blockWithItem(CaveopolisBlocks.COLORED_PLANKS);
        fenceWithElements((FenceBlock) CaveopolisBlocks.COLORED_PLANK_FENCE.get(), CaveopolisBlocks.COLORED_PLANKS.get());
        fenceGateWithElements((FenceGateBlock) CaveopolisBlocks.COLORED_PLANK_FENCE_GATE.get(), CaveopolisBlocks.COLORED_PLANKS.get());
        doorWithElements((DoorBlock) CaveopolisBlocks.COLORED_PLANK_DOOR.get(), CaveopolisBlocks.COLORED_PLANKS.get());
        trapDoorWithElements((TrapDoorBlock) CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get(), CaveopolisBlocks.COLORED_PLANK_TRAPDOOR.get(), true);
        logBlockWithElement(CaveopolisBlocks.COLORED_LOG.get());
        woodBlockWithElement((RotatedPillarBlock) CaveopolisBlocks.COLORED_WOOD.get(), CaveopolisBlocks.COLORED_LOG.get());
        strippedLogBlockWithElement((RotatedPillarBlock) CaveopolisBlocks.STRIPPED_COLORED_LOG.get(), CaveopolisBlocks.STRIPPED_COLORED_LOG.get());
        strippedWoodBlockWithElement((RotatedPillarBlock) CaveopolisBlocks.STRIPPED_COLORED_WOOD.get(), CaveopolisBlocks.STRIPPED_COLORED_LOG.get());
        blockWithItem(CaveopolisBlocks.COLORED_LEAVES);




        blockWithItem(CaveopolisBlocks.COLORED_BRICKS);
        blockWithItem(CaveopolisBlocks.COLORED_STONE_BRICKS);
        blockWithItem(CaveopolisBlocks.COLORED_DIRT);
        blockWithItem(CaveopolisBlocks.COLORED_COBBLESTONE);
        blockWithItem(CaveopolisBlocks.COLORED_COBBLESTONE_BRICKS);
        blockWithItem(CaveopolisBlocks.COLORED_MARBLE);
        blockWithItem(CaveopolisBlocks.COLORED_MARBLE_BRICKS);




    }




    private void blockWithItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), blockWithElements(blockRegistryObject.get().defaultBlockState().getBlock()));
    }

    private void blockItem(DeferredBlock<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("caveopolis:block/" + BuiltInRegistries.BLOCK.getKey(blockRegistryObject.get()).getPath()));
    }

    private void strippedWoodBlockWithElement(RotatedPillarBlock strippedWoodBlock, Block logBlock) {

        ResourceLocation woodBlockRegistryName = BuiltInRegistries.BLOCK.getKey(strippedWoodBlock);
        ResourceLocation logBlockRegistryName = BuiltInRegistries.BLOCK.getKey(logBlock);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(logBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath());
        ResourceLocation textureTop = ResourceLocation.fromNamespaceAndPath(logBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath());

        ModelFile log = models().withExistingParent(woodBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        ModelFile logHorizontal = models().withExistingParent(woodBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column_horizontal")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        getVariantBuilder(strippedWoodBlock)
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                .modelForState().modelFile(log).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                .modelForState().modelFile(logHorizontal).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                .modelForState().modelFile(logHorizontal).rotationX(90).rotationY(90).addModel();

        simpleBlockItem(strippedWoodBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + woodBlockRegistryName.getPath()));


    }

    private void strippedLogBlockWithElement(RotatedPillarBlock strippedLogBlock, Block logBlock) {
        ResourceLocation strippedLogBlockRegistryName = BuiltInRegistries.BLOCK.getKey(strippedLogBlock);
        ResourceLocation logBlockRegistryName = BuiltInRegistries.BLOCK.getKey(logBlock);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(strippedLogBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath());
        ResourceLocation textureTop = ResourceLocation.fromNamespaceAndPath(strippedLogBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath() + "_top");

        ModelFile log = models().withExistingParent(strippedLogBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        ModelFile logHorizontal = models().withExistingParent(strippedLogBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column_horizontal")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        getVariantBuilder(strippedLogBlock)
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                .modelForState().modelFile(log).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                .modelForState().modelFile(logHorizontal).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                .modelForState().modelFile(logHorizontal).rotationX(90).rotationY(90).addModel();

        simpleBlockItem(strippedLogBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + strippedLogBlockRegistryName.getPath()));


    }

    private void woodBlockWithElement(RotatedPillarBlock woodBlock, Block logBlock) {
        ResourceLocation woodBlockRegistryName = BuiltInRegistries.BLOCK.getKey(woodBlock);
        ResourceLocation logBlockRegistryName = BuiltInRegistries.BLOCK.getKey(logBlock);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(logBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath());
        ResourceLocation textureTop = ResourceLocation.fromNamespaceAndPath(logBlockRegistryName.getNamespace(), "block/" + logBlockRegistryName.getPath());

        ModelFile log = models().withExistingParent(woodBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        ModelFile logHorizontal = models().withExistingParent(woodBlockRegistryName.getPath(), "caveopolis:block/tintable_cube_column_horizontal")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        getVariantBuilder(woodBlock)
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                .modelForState().modelFile(log).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                .modelForState().modelFile(logHorizontal).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                .modelForState().modelFile(logHorizontal).rotationX(90).rotationY(90).addModel();

        simpleBlockItem(woodBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + woodBlockRegistryName.getPath()));

    }

    private void logBlockWithElement(Block block) {
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());
        ResourceLocation textureTop = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath() + "_top");

        ModelFile log = models().withExistingParent(blockRegistryName.getPath(), "caveopolis:block/tintable_cube_column")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        ModelFile logHorizontal = models().withExistingParent(blockRegistryName.getPath(), "caveopolis:block/tintable_cube_column_horizontal")
                .texture("side", texture).texture("end", textureTop).renderType("cutout");

        getVariantBuilder(block)
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y)
                .modelForState().modelFile(log).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z)
                .modelForState().modelFile(logHorizontal).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X)
                .modelForState().modelFile(logHorizontal).rotationX(90).rotationY(90).addModel();

        simpleBlockItem(block, new ModelFile.UncheckedModelFile("caveopolis:block/" + blockRegistryName.getPath()));

    }

    private ModelFile blockWithElements(Block block) {

        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        return models().cubeAll(blockRegistryName.getPath(), texture)
                .element()
                .from(0, 0, 0)
                .to(16, 16, 16)
                .allFaces((direction, face) -> face.texture("#all").tintindex(0))
                .end();
    }

    private void trapDoorWithElements(TrapDoorBlock trapDoorBlock, Block block, boolean orientable) {
        ResourceLocation trapDoorBlockRegistryName = BuiltInRegistries.BLOCK.getKey(trapDoorBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile trapDoorTop = models().withExistingParent(trapDoorBlockRegistryName.getPath() + "_top",
                "caveopolis:block/trapdoor/tintable_orientable_trapdoor_top").texture("texture", texture).renderType("cutout");

        ModelFile trapDoorBottom = models().withExistingParent(trapDoorBlockRegistryName.getPath() + "_bottom",
                "caveopolis:block/trapdoor/tintable_orientable_trapdoor_bottom").texture("texture", texture).renderType("cutout");

        ModelFile trapDoorOpen = models().withExistingParent(trapDoorBlockRegistryName.getPath() + "_open",
                "caveopolis:block/trapdoor/tintable_orientable_trapdoor_open").texture("texture", texture).renderType("cutout");

        getVariantBuilder(trapDoorBlock).forAllStatesExcept(state -> {
            int xRot = 0;
            int yRot = ((int) state.getValue(TrapDoorBlock.FACING).toYRot()) + 180;
            boolean isOpen = state.getValue(TrapDoorBlock.OPEN);
            if (orientable && isOpen && state.getValue(TrapDoorBlock.HALF) == Half.TOP) {
                xRot += 180;
                yRot += 180;
            }
            if (!orientable && !isOpen) {
                yRot = 0;
            }
            yRot %= 360;
            return ConfiguredModel.builder().modelFile(isOpen ? trapDoorOpen : state.getValue(TrapDoorBlock.HALF) == Half.TOP ? trapDoorTop : trapDoorBottom)
                    .rotationX(xRot)
                    .rotationY(yRot)
                    .build();
        }, TrapDoorBlock.POWERED, TrapDoorBlock.WATERLOGGED);

        simpleBlockItem(trapDoorBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + trapDoorBlockRegistryName.getPath() + "_bottom"));
    }

    private void doorWithElements(DoorBlock doorBlock, Block block) {

        ResourceLocation doorBlockRegistryName = BuiltInRegistries.BLOCK.getKey(doorBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());
        ResourceLocation textureTop = ResourceLocation.fromNamespaceAndPath(doorBlockRegistryName.getNamespace(), "block/" + doorBlockRegistryName.getPath() + "_top");
        ResourceLocation textureBottom = ResourceLocation.fromNamespaceAndPath(doorBlockRegistryName.getNamespace(), "block/" + doorBlockRegistryName.getPath() + "_bottom");

        ModelFile doorTopRightOpen = models().withExistingParent(doorBlockRegistryName.getPath() + "_top_right_open",
                "caveopolis:block/door/tintable_door_top_right_open").texture("top", textureTop).renderType("cutout");

        ModelFile doorTopLeftOpen = models().withExistingParent(doorBlockRegistryName.getPath() + "_top_left_open",
                "caveopolis:block/door/tintable_door_top_left_open").texture("top", textureTop).renderType("cutout");

        ModelFile doorTopRight = models().withExistingParent(doorBlockRegistryName.getPath() + "_top_right",
                "caveopolis:block/door/tintable_door_top_right").texture("top", textureTop).renderType("cutout");

        ModelFile doorTopLeft = models().withExistingParent(doorBlockRegistryName.getPath() + "_top_left",
                "caveopolis:block/door/tintable_door_top_left").texture("top", textureTop).renderType("cutout");

        ModelFile doorBottomRight = models().withExistingParent(doorBlockRegistryName.getPath() + "_bottom_right",
                "caveopolis:block/door/tintable_door_bottom_right").texture("bottom", textureBottom).renderType("cutout");

        ModelFile doorBottomLeft = models().withExistingParent(doorBlockRegistryName.getPath() + "_bottom_left",
                "caveopolis:block/door/tintable_door_bottom_left").texture("bottom", textureBottom).renderType("cutout");

        ModelFile doorBottomRightOpen = models().withExistingParent(doorBlockRegistryName.getPath() + "_bottom_right_open",
                "caveopolis:block/door/tintable_door_bottom_right_open").texture("bottom", textureBottom).renderType("cutout");

        ModelFile doorBottomLeftOpen = models().withExistingParent(doorBlockRegistryName.getPath() + "_bottom_left_open",
                "caveopolis:block/door/tintable_door_bottom_left_open").texture("bottom", textureBottom).renderType("cutout");

        getVariantBuilder(doorBlock).forAllStatesExcept(state -> {
            int yRot = ((int) state.getValue(DoorBlock.FACING).toYRot()) + 90;
            boolean right = state.getValue(DoorBlock.HINGE) == DoorHingeSide.RIGHT;
            boolean open = state.getValue(DoorBlock.OPEN);
            boolean lower = state.getValue(DoorBlock.HALF) == DoubleBlockHalf.LOWER;
            if (open) {
                yRot += 90;
            }
            if (right && open) {
                yRot += 180;
            }
            yRot %= 360;

            ModelFile model = null;
            if (lower && right && open) {
                model = doorBottomRightOpen;
            } else if (lower && !right && open) {
                model = doorBottomLeftOpen;
            }
            if (lower && right && !open) {
                model = doorBottomRight;
            } else if (lower && !right && !open) {
                model = doorBottomLeft;
            }
            if (!lower && right && open) {
                model = doorTopRightOpen;
            } else if (!lower && !right && open) {
                model = doorTopLeftOpen;
            }
            if (!lower && right && !open) {
                model = doorTopRight;
            } else if (!lower && !right && !open) {
                model = doorTopLeft;
            }

            return ConfiguredModel.builder().modelFile(model)
                    .rotationY(yRot)
                    .build();
        }, DoorBlock.POWERED, ColoredDoor.LIT);
    }

    private void fenceGateWithElements(FenceGateBlock fenceGateBlock, Block block) {

        ResourceLocation fenceGateBlockRegistryName = BuiltInRegistries.BLOCK.getKey(fenceGateBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile fenceGate = models().withExistingParent(fenceGateBlockRegistryName.getPath(),
                "caveopolis:block/fence_gate/tintable_fence_gate").texture("texture", texture).renderType("cutout");

        ModelFile fenceGateOpen = models().withExistingParent(fenceGateBlockRegistryName.getPath() + "_open",
                "caveopolis:block/fence_gate/tintable_fence_gate_open").texture("texture", texture).renderType("cutout");

        ModelFile fenceGateWallOpen = models().withExistingParent(fenceGateBlockRegistryName.getPath() + "_wall_open",
                "caveopolis:block/fence_gate/tintable_fence_gate_wall_open").texture("texture", texture).renderType("cutout");

        ModelFile fenceGateWall = models().withExistingParent(fenceGateBlockRegistryName.getPath() + "_wall",
                "caveopolis:block/fence_gate/tintable_fence_gate_wall").texture("texture", texture).renderType("cutout");

        getVariantBuilder(fenceGateBlock).forAllStatesExcept(state -> {
            ModelFile model = fenceGate;
            if (state.getValue(FenceGateBlock.IN_WALL)) {
                model = fenceGateWall;
            }
            if (state.getValue(FenceGateBlock.OPEN)) {
                model = model == fenceGateWall ? fenceGateWallOpen : fenceGateOpen;
            }
            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) state.getValue(FenceGateBlock.FACING).toYRot())
                    .uvLock(true)
                    .build();
        }, FenceGateBlock.POWERED, ColoredFence.LIT);

        simpleBlockItem(fenceGateBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + fenceGateBlockRegistryName.getPath()));

    }

    private void fenceWithElements(FenceBlock fenceBlock, Block block) {
        ResourceLocation fenceBlockRegistryName = BuiltInRegistries.BLOCK.getKey(fenceBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile fenceInventory = models().withExistingParent(fenceBlockRegistryName.getPath() + "_inventory",
                "caveopolis:block/fence/tintable_fence_inventory").texture("texture", texture).renderType("cutout");

        ModelFile fencePost = models().withExistingParent(fenceBlockRegistryName.getPath() + "_post",
                "caveopolis:block/fence/tintable_fence_post").texture("texture", texture).renderType("cutout");

        ModelFile fenceSide = models().withExistingParent(fenceBlockRegistryName.getPath() + "_side",
                "caveopolis:block/fence/tintable_fence_side").texture("texture", texture).renderType("cutout");

        MultiPartBlockStateBuilder builder = getMultipartBuilder(fenceBlock)
                .part().modelFile(fencePost).addModel().end();
        fourWayMultipart(builder, fenceSide);

        simpleBlockItem(fenceBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + fenceBlockRegistryName.getPath() + "_inventory"));

    }

    private void buttonWithElements(ButtonBlock buttonBlock, Block block) {
        ResourceLocation buttonBlockRegistryName = BuiltInRegistries.BLOCK.getKey(buttonBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile button = models().withExistingParent(buttonBlockRegistryName.getPath(),
                "caveopolis:block/button/tintable_button").texture("texture", texture).renderType("cutout");

        ModelFile buttonPressed = models().withExistingParent(buttonBlockRegistryName.getPath() + "_pressed",
                "caveopolis:block/button/tintable_button_pressed").texture("texture", texture).renderType("cutout");

        ModelFile buttonInventory = models().withExistingParent(buttonBlockRegistryName.getPath() + "_inventory",
                "caveopolis:block/button/tintable_button_inventory").texture("texture", texture).renderType("cutout");

        getVariantBuilder(buttonBlock).forAllStates(state -> {
            Direction facing = state.getValue(ButtonBlock.FACING);
            AttachFace face = state.getValue(ButtonBlock.FACE);
            boolean powered = state.getValue(ButtonBlock.POWERED);

            return ConfiguredModel.builder()
                    .modelFile(powered ? buttonPressed : button)
                    .rotationX(face == AttachFace.FLOOR ? 0 : (face == AttachFace.WALL ? 90 : 180))
                    .rotationY((int) (face == AttachFace.CEILING ? facing : facing.getOpposite()).toYRot())
                    .uvLock(face == AttachFace.WALL)
                    .build();
        });

        simpleBlockItem(buttonBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + buttonBlockRegistryName.getPath() + "_inventory"));

    }

    private void pressurePlateWithElements(PressurePlateBlock pressurePlateBlock, Block block) {
        ResourceLocation pressurePlateBlockRegistryName = BuiltInRegistries.BLOCK.getKey(pressurePlateBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile pressurePlate = models().withExistingParent(pressurePlateBlockRegistryName.getPath(),
                "caveopolis:block/pressure_plate/tintable_pressure_plate_up").texture("texture", texture).renderType("cutout");

        ModelFile pressurePlateDown = models().withExistingParent(pressurePlateBlockRegistryName.getPath() + "_down",
                "caveopolis:block/pressure_plate/tintable_pressure_plate_down").texture("texture", texture).renderType("cutout");

        getVariantBuilder(pressurePlateBlock)
                .partialState().with(PressurePlateBlock.POWERED, true).addModels(new ConfiguredModel(pressurePlateDown))
                .partialState().with(PressurePlateBlock.POWERED, false).addModels(new ConfiguredModel(pressurePlate));

        simpleBlockItem(pressurePlateBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + pressurePlateBlockRegistryName.getPath()));

    }


    private void wallWithElements(WallBlock wallBlock, Block block) {
        ResourceLocation wallBlockRegistryName = BuiltInRegistries.BLOCK.getKey(wallBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile wallInventory = models().withExistingParent(wallBlockRegistryName.getPath() + "_inventory",
                "caveopolis:block/wall/tintable_wall_inventory").texture("wall", texture).renderType("cutout");

        ModelFile wallPost = models().withExistingParent(wallBlockRegistryName.getPath() + "_post",
                "caveopolis:block/wall/tintable_wall_post").texture("wall", texture).renderType("cutout");

        ModelFile wallSide = models().withExistingParent(wallBlockRegistryName.getPath() + "_side",
                "caveopolis:block/wall/tintable_wall_side").texture("wall", texture).renderType("cutout");

        ModelFile wallSideTall = models().withExistingParent(wallBlockRegistryName.getPath() + "_side_tall",
                "caveopolis:block/wall/tintable_wall_side_tall").texture("wall", texture).renderType("cutout");

        MultiPartBlockStateBuilder builder = getMultipartBuilder(wallBlock)
                .part().modelFile(wallPost).addModel()
                .condition(WallBlock.UP, true).end();
        WALL_PROPS.entrySet().stream()
                .filter(e -> e.getKey().getAxis().isHorizontal())
                .forEach(e -> {
                    wallSidePart(builder, wallSide, e, WallSide.LOW);
                    wallSidePart(builder, wallSideTall, e, WallSide.TALL);
                });

        simpleBlockItem(wallBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + wallBlockRegistryName.getPath() + "_inventory"));


    }

    private void wallSidePart(MultiPartBlockStateBuilder builder, ModelFile model, Map.Entry<Direction, Property<WallSide>> entry, WallSide height) {
        builder.part()
                .modelFile(model)
                .rotationY((((int) entry.getKey().toYRot()) + 180) % 360)
                .uvLock(true)
                .addModel()
                .condition(entry.getValue(), height);
    }


    private void slabWithElements(SlabBlock slabBlock, Block block) {
        ResourceLocation slabBlockRegistryName = BuiltInRegistries.BLOCK.getKey(slabBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile slab = models().withExistingParent(slabBlockRegistryName.getPath(), "caveopolis:block/slab/tintable_slab")
                .texture("bottom", texture).texture("top", texture).texture("side", texture).renderType("cutout");

        ModelFile slabTop = models().withExistingParent(slabBlockRegistryName.getPath() + "_top", "caveopolis:block/slab/tintable_slab_top")
                .texture("bottom", texture).texture("top", texture).texture("side", texture).renderType("cutout");

        ModelFile doubleSlab = models().cubeAll(blockRegistryName.getPath(), texture);

        getVariantBuilder(slabBlock)
                .partialState().with(SlabBlock.TYPE, SlabType.BOTTOM).addModels(new ConfiguredModel(slab))
                .partialState().with(SlabBlock.TYPE, SlabType.TOP).addModels(new ConfiguredModel(slabTop))
                .partialState().with(SlabBlock.TYPE, SlabType.DOUBLE).addModels(new ConfiguredModel(doubleSlab));


        simpleBlockItem(slabBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + slabBlockRegistryName.getPath()));

    }

    private void stairsWithElements(StairBlock stairsBlock, Block block) {
        ResourceLocation stairBlockRegistryName = BuiltInRegistries.BLOCK.getKey(stairsBlock);
        ResourceLocation blockRegistryName = BuiltInRegistries.BLOCK.getKey(block);
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(blockRegistryName.getNamespace(), "block/" + blockRegistryName.getPath());

        ModelFile stairs = models().withExistingParent(stairBlockRegistryName.getPath(), "caveopolis:block/stairs/tintable_stairs")
                .texture("bottom", texture).texture("top", texture).texture("side", texture).renderType("cutout");

        ModelFile innerStairs = models().withExistingParent(stairBlockRegistryName.getPath() + "_inner", "caveopolis:block/stairs/tintable_inner_stairs")
                .texture("bottom", texture).texture("top", texture).texture("side", texture).renderType("cutout");

        ModelFile outerStairs = models().withExistingParent(stairBlockRegistryName.getPath() + "_outer", "caveopolis:block/stairs/tintable_outer_stairs")
                .texture("bottom", texture).texture("top", texture).texture("side", texture).renderType("cutout");

        getVariantBuilder(stairsBlock)
                .forAllStatesExcept(state -> {
                    Direction facing = state.getValue(StairBlock.FACING);
                    Half half = state.getValue(StairBlock.HALF);
                    StairsShape shape = state.getValue(StairBlock.SHAPE);
                    int yRot = (int) facing.getClockWise().toYRot();
                    if (shape == StairsShape.INNER_LEFT || shape == StairsShape.OUTER_LEFT) {
                        yRot += 270;
                    }
                    if (shape != StairsShape.STRAIGHT && half == Half.TOP) {
                        yRot += 90;
                    }
                    yRot %= 360;
                    boolean uvlock = yRot != 0 || half == Half.TOP;
                    return ConfiguredModel.builder()
                            .modelFile(shape == StairsShape.STRAIGHT ? stairs : shape == StairsShape.INNER_LEFT || shape == StairsShape.INNER_RIGHT ? innerStairs : outerStairs)
                            .rotationX(half == Half.BOTTOM ? 0 : 180)
                            .rotationY(yRot)
                            .uvLock(uvlock)
                            .build();
                }, StairBlock.WATERLOGGED);

        simpleBlockItem(stairsBlock, new ModelFile.UncheckedModelFile("caveopolis:block/" + stairBlockRegistryName.getPath()));


    }




    @Override
    public String getName() {
        return Caveopolis.MOD_ID + " Block States";
    }
}