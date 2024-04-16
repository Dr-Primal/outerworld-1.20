package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.primal.outerworld.block.OuterWorldBlocks;

import java.util.concurrent.CompletableFuture;

public class OuterWorldBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public OuterWorldBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(OuterWorldBlocks.PURPLE_ICE)
                .add(OuterWorldBlocks.RUBY_BLOCK)



                .add(OuterWorldBlocks.VIOLET_STONE)
                .add(OuterWorldBlocks.VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.VIOLET_STONE_BUTTON)
                .add(OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICKS)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL)

                .add(OuterWorldBlocks.DEEP_VIOLET_STONE)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL)



                .add(OuterWorldBlocks.SCORCH_STONE)
                .add(OuterWorldBlocks.SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.SCORCH_STONE_BUTTON)
                .add(OuterWorldBlocks.SCORCH_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_WALL)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICKS)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_WALL)

                .add(OuterWorldBlocks.DEEP_SCORCH_STONE)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BUTTON)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_WALL)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICKS)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_WALL)



                .add(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR)
                .add(OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN)
                .add(OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN)
                .add(OuterWorldBlocks.HANGING_AUTUMN_MAPLE_SIGN)
                .add(OuterWorldBlocks.WALL_HANGING_AUTUMN_MAPLE_SIGN)

                .add(OuterWorldBlocks.PRIMUBERANT_LOG)
                .add(OuterWorldBlocks.PRIMUBERANT_WOOD)
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG)
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD)
                .add(OuterWorldBlocks.PRIMUBERANT_PLANKS)
                .add(OuterWorldBlocks.PRIMUBERANT_STAIRS)
                .add(OuterWorldBlocks.PRIMUBERANT_SLAB)
                .add(OuterWorldBlocks.PRIMUBERANT_BUTTON)
                .add(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE)
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE)
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE)
                .add(OuterWorldBlocks.PRIMUBERANT_DOOR)
                .add(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR)
                .add(OuterWorldBlocks.WALL_PRIMUBERANT_SIGN)
                .add(OuterWorldBlocks.STANDING_PRIMUBERANT_SIGN)
                .add(OuterWorldBlocks.HANGING_PRIMUBERANT_SIGN)
                .add(OuterWorldBlocks.WALL_HANGING_PRIMUBERANT_SIGN);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD)
                .add(OuterWorldBlocks.PRIMUBERANT_LOG)
                .add(OuterWorldBlocks.PRIMUBERANT_WOOD)
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG)
                .add(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS)
                .add(OuterWorldBlocks.PRIMUBERANT_STAIRS);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(OuterWorldBlocks.VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_STAIRS)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_STAIRS)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB)
                .add(OuterWorldBlocks.PRIMUBERANT_SLAB);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(OuterWorldBlocks.VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_SLAB)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_SLAB)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE)
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE)
                .add(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL)
                .add(OuterWorldBlocks.VIOLET_STONE_BRICK_WALL)
                .add(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL)
                .add(OuterWorldBlocks.COBBLED_SCORCH_STONE_WALL)
                .add(OuterWorldBlocks.SCORCH_STONE_BRICK_WALL)
                .add(OuterWorldBlocks.COBBLED_DEEP_SCORCH_STONE_WALL)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICK_WALL);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON)
                .add(OuterWorldBlocks.PRIMUBERANT_BUTTON);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(OuterWorldBlocks.VIOLET_STONE_BUTTON)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON)
                .add(OuterWorldBlocks.SCORCH_STONE_BUTTON)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.STONE_PRESSURE_PLATES)
                .add(OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.SCORCH_STONE_PRESSURE_PLATE)
                .add(OuterWorldBlocks.DEEP_SCORCH_STONE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR)
                .add(OuterWorldBlocks.PRIMUBERANT_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR)
                .add(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(OuterWorldBlocks.PURPLE_ICE)
                .add(OuterWorldBlocks.RUBY_BLOCK);

        //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                //.add(Block.Whatever);
    }
}