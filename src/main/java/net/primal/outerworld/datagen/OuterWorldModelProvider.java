package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;

public class OuterWorldModelProvider extends FabricModelProvider {
    public OuterWorldModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool violetStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.VIOLET_STONE);
        BlockStateModelGenerator.BlockTexturePool cobbledVioletStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.COBBLED_VIOLET_STONE);
        BlockStateModelGenerator.BlockTexturePool violetStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.VIOLET_STONE_BRICKS);

        violetStonePool.stairs(OuterWorldBlocks.VIOLET_STONE_STAIRS);
        violetStonePool.slab(OuterWorldBlocks.VIOLET_STONE_SLAB);
        violetStonePool.button(OuterWorldBlocks.VIOLET_STONE_BUTTON);
        violetStonePool.pressurePlate(OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE);

        cobbledVioletStonePool.stairs(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS);
        cobbledVioletStonePool.slab(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB);
        cobbledVioletStonePool.wall(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL);

        violetStoneBrickPool.stairs(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS);
        violetStoneBrickPool.slab(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB);
        violetStoneBrickPool.wall(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool deepVioletStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.DEEP_VIOLET_STONE);
        BlockStateModelGenerator.BlockTexturePool cobbledDeepVioletStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);
        BlockStateModelGenerator.BlockTexturePool deepVioletStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);

        deepVioletStonePool.stairs(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS);
        deepVioletStonePool.slab(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB);
        deepVioletStonePool.button(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON);
        deepVioletStonePool.pressurePlate(OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE);

        cobbledDeepVioletStonePool.stairs(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS);
        cobbledDeepVioletStonePool.slab(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB);
        cobbledDeepVioletStonePool.wall(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL);

        deepVioletStoneBrickPool.stairs(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS);
        deepVioletStoneBrickPool.slab(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB);
        deepVioletStoneBrickPool.wall(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool scorchStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.SCORCH_STONE);
        BlockStateModelGenerator.BlockTexturePool cobbledScorchStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.COBBLED_SCORCH_STONE);
        BlockStateModelGenerator.BlockTexturePool scorchStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.SCORCH_STONE_BRICKS);

        scorchStonePool.stairs(OuterWorldBlocks.SCORCH_STONE_STAIRS);
        scorchStonePool.slab(OuterWorldBlocks.SCORCH_STONE_SLAB);
        scorchStonePool.button(OuterWorldBlocks.SCORCH_STONE_BUTTON);
        scorchStonePool.pressurePlate(OuterWorldBlocks.SCORCH_STONE_PRESSURE_PLATE);

        cobbledScorchStonePool.stairs(OuterWorldBlocks.COBBLED_SCORCH_STONE_STAIRS);
        cobbledScorchStonePool.slab(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB);
        cobbledScorchStonePool.wall(OuterWorldBlocks.COBBLED_SCORCH_STONE_WALL);

        scorchStoneBrickPool.stairs(OuterWorldBlocks.SCORCH_STONE_BRICK_STAIRS);
        scorchStoneBrickPool.slab(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB);
        scorchStoneBrickPool.wall(OuterWorldBlocks.SCORCH_STONE_BRICK_WALL);

        BlockStateModelGenerator.BlockTexturePool deepScorchStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.DEEP_SCORCH_STONE);
        BlockStateModelGenerator.BlockTexturePool cobbledDeepScorchStonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE);
        BlockStateModelGenerator.BlockTexturePool deepScorchStoneBrickPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICKS);

        deepScorchStonePool.stairs(OuterWorldBlocks.DEEP_SCORCH_STONE_STAIRS);
        deepScorchStonePool.slab(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB);
        deepScorchStonePool.button(OuterWorldBlocks.DEEP_SCORCH_STONE_BUTTON);
        deepScorchStonePool.pressurePlate(OuterWorldBlocks.DEEP_SCORCH_STONE_PRESSURE_PLATE);

        cobbledDeepScorchStonePool.stairs(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_STAIRS);
        cobbledDeepScorchStonePool.slab(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB);
        cobbledDeepScorchStonePool.wall(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_WALL);

        deepScorchStoneBrickPool.stairs(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_STAIRS);
        deepScorchStoneBrickPool.slab(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB);
        deepScorchStoneBrickPool.wall(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_WALL);


        BlockStateModelGenerator.BlockTexturePool autumnMaplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        autumnMaplePool.family(OuterWorldBlocks.AUTUMN_MAPLE_FAMILY);

        BlockStateModelGenerator.BlockTexturePool primuberantPool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.PRIMUBERANT_PLANKS);
        primuberantPool.family(OuterWorldBlocks.PRIMUBERANT_FAMILY);

        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.PURPLE_ICE);
        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.RUBY_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE);

        blockStateModelGenerator.registerLog(OuterWorldBlocks.AUTUMN_MAPLE_LOG).log(OuterWorldBlocks.AUTUMN_MAPLE_LOG).wood(OuterWorldBlocks.AUTUMN_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG).log(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG).wood(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES);

        autumnMaplePool.stairs(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS);
        autumnMaplePool.slab(OuterWorldBlocks.AUTUMN_MAPLE_SLAB);
        autumnMaplePool.button(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON);
        autumnMaplePool.pressurePlate(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE);
        autumnMaplePool.fence(OuterWorldBlocks.AUTUMN_MAPLE_FENCE);
        autumnMaplePool.fenceGate(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE);
        blockStateModelGenerator.registerHangingSign(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG, OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.WALL_HANGING_AUTUMN_MAPLE_SIGN);

        blockStateModelGenerator.registerDoor(OuterWorldBlocks.AUTUMN_MAPLE_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR);



        blockStateModelGenerator.registerLog(OuterWorldBlocks.PRIMUBERANT_LOG).log(OuterWorldBlocks.PRIMUBERANT_LOG).wood(OuterWorldBlocks.PRIMUBERANT_WOOD);
        blockStateModelGenerator.registerLog(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG).log(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG).wood(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD);

        primuberantPool.stairs(OuterWorldBlocks.PRIMUBERANT_STAIRS);
        primuberantPool.slab(OuterWorldBlocks.PRIMUBERANT_SLAB);
        primuberantPool.button(OuterWorldBlocks.PRIMUBERANT_BUTTON);
        primuberantPool.pressurePlate(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE);
        primuberantPool.fence(OuterWorldBlocks.PRIMUBERANT_FENCE);
        primuberantPool.fenceGate(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE);
        blockStateModelGenerator.registerHangingSign(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG, OuterWorldBlocks.HANGING_PRIMUBERANT_SIGN, OuterWorldBlocks.WALL_HANGING_PRIMUBERANT_SIGN);

        blockStateModelGenerator.registerDoor(OuterWorldBlocks.PRIMUBERANT_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR);

        blockStateModelGenerator.registerTintableCross(OuterWorldBlocks.AUTUMN_MAPLE_SAPLING,
                BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(OuterWorldItems.RUBY, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) OuterWorldItems.RUBY_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) OuterWorldItems.RUBY_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) OuterWorldItems.RUBY_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) OuterWorldItems.RUBY_BOOTS));

        itemModelGenerator.register(OuterWorldItems.RUBY_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(OuterWorldItems.RUBY_AXE, Models.HANDHELD);
        itemModelGenerator.register(OuterWorldItems.RUBY_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(OuterWorldItems.RUBY_SWORD, Models.HANDHELD);
        itemModelGenerator.register(OuterWorldItems.RUBY_HOE, Models.HANDHELD);

        itemModelGenerator.register(OuterWorldItems.AUTUMN_SAMARA, Models.GENERATED);

        itemModelGenerator.register(OuterWorldItems.AUTUMN_MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(OuterWorldItems.PRIMUBERANT_BOAT, Models.GENERATED);
        itemModelGenerator.register(OuterWorldItems.PRIMUBERANT_CHEST_BOAT, Models.GENERATED);

    }
}