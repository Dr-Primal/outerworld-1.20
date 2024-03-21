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
        BlockStateModelGenerator.BlockTexturePool autumnMaplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        autumnMaplePool.family(OuterWorldBlocks.AUTUMN_MAPLE_FAMILY);

        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.PURPLE_ICE);
        blockStateModelGenerator.registerSimpleCubeAll(OuterWorldBlocks.RUBY_BLOCK);

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
        blockStateModelGenerator.registerTrapdoor(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR);

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

    }
}