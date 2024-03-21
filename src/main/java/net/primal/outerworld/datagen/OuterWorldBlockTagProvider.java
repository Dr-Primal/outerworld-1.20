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
                .add(OuterWorldBlocks.RUBY_BLOCK);

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
                .add(OuterWorldBlocks.WALL_HANGING_AUTUMN_MAPLE_SIGN);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG)
                .add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_SLAB);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(OuterWorldBlocks.PURPLE_ICE)
                .add(OuterWorldBlocks.RUBY_BLOCK);

        //getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                //.add(Block.Whatever);
    }
}