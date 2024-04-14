package net.primal.outerworld.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.item.OuterWorldItems;
import net.primal.outerworld.util.OuterWorldTags;

import java.util.List;
import java.util.function.Consumer;

public class OuterWorldRecipeProvider extends FabricRecipeProvider {
    public OuterWorldRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        /*
        *Crafting Table Recipes
        */

        //Woods
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_WOOD, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_WOOD.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.PRIMUBERANT_WOOD, 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.PRIMUBERANT_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_WOOD.asItem())));

        //Stripped Woods
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD.asItem())));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem(), 3)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem())
                .criterion(hasItem(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem()),
                        conditionsFromItem(OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.STRIPPED_PRIMUBERANT_WOOD.asItem())));

        //Planks
        offerPlanksRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem(), OuterWorldTags.Items.AUTUMN_MAPLE_LOGS, 4);
        offerPlanksRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem(), OuterWorldTags.Items.PRIMUBERANT_LOGS, 4);


        //Wooden Stairs
        createStairsRecipe(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_STAIRS.asItem())));
        createStairsRecipe(OuterWorldBlocks.PRIMUBERANT_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_STAIRS.asItem())));

        //Wooden Slabs
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.AUTUMN_MAPLE_SLAB, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.PRIMUBERANT_SLAB, OuterWorldBlocks.PRIMUBERANT_PLANKS);


        //Wooden Buttons
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_BUTTON, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS, "outer_world_blocks");
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_BUTTON, OuterWorldBlocks.PRIMUBERANT_PLANKS, "outer_world_blocks");


        //Wooden Pressure Plates
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.AUTUMN_MAPLE_PRESSURE_PLATE, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS);
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.PRIMUBERANT_PRESSURE_PLATE, OuterWorldBlocks.PRIMUBERANT_PLANKS);


        //Fences
        createFenceRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE.asItem())));
        createFenceRecipe(OuterWorldBlocks.PRIMUBERANT_FENCE.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_FENCE.asItem())));

        //Fence Gates
        createFenceGateRecipe(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_FENCE_GATE.asItem())));
        createFenceGateRecipe(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_FENCE_GATE.asItem())));

        //Wooden Doors
        createDoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_DOOR.asItem())));
        createDoorRecipe(OuterWorldBlocks.PRIMUBERANT_DOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_DOOR.asItem())));

        //Wooden Trapdoors
        createTrapdoorRecipe(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.AUTUMN_MAPLE_TRAPDOOR.asItem())));
        createTrapdoorRecipe(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR.asItem(), Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.PRIMUBERANT_TRAPDOOR.asItem())));

        //Signs
        createSignRecipe(OuterWorldItems.AUTUMN_MAPLE_SIGN, Ingredient.ofItems(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.AUTUMN_MAPLE_SIGN)));
        createSignRecipe(OuterWorldItems.PRIMUBERANT_SIGN, Ingredient.ofItems(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem()))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.PRIMUBERANT_SIGN)));

        //Hanging Signs
        offerHangingSignRecipe(exporter, OuterWorldItems.HANGING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG.asItem());
        offerHangingSignRecipe(exporter, OuterWorldItems.HANGING_PRIMUBERANT_SIGN, OuterWorldBlocks.STRIPPED_PRIMUBERANT_LOG.asItem());

        //Boats
        offerBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_BOAT, OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.asItem());
        offerBoatRecipe(exporter, OuterWorldItems.PRIMUBERANT_BOAT, OuterWorldBlocks.PRIMUBERANT_PLANKS.asItem());

        //Boat With Chests
        offerChestBoatRecipe(exporter, OuterWorldItems.AUTUMN_MAPLE_CHEST_BOAT, OuterWorldItems.AUTUMN_MAPLE_BOAT);
        offerChestBoatRecipe(exporter, OuterWorldItems.PRIMUBERANT_CHEST_BOAT, OuterWorldItems.PRIMUBERANT_BOAT);



        //Stone Recipes
        //Deep Violet Stone
        createStairsRecipe(OuterWorldBlocks.VIOLET_STONE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.VIOLET_STONE.asItem()))
                .criterion(hasItem(OuterWorldBlocks.VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.VIOLET_STONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_SLAB, OuterWorldBlocks.VIOLET_STONE);
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.VIOLET_STONE_BUTTON, OuterWorldBlocks.VIOLET_STONE, "outer_world_blocks");
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.VIOLET_STONE_PRESSURE_PLATE, OuterWorldBlocks.VIOLET_STONE);

        createStairsRecipe(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.COBBLED_VIOLET_STONE.asItem()))
                .criterion(hasItem(OuterWorldBlocks.COBBLED_VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.COBBLED_VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB, OuterWorldBlocks.COBBLED_VIOLET_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL, OuterWorldBlocks.COBBLED_VIOLET_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICKS, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.VIOLET_STONE.asItem())
                .criterion(hasItem(OuterWorldBlocks.VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.VIOLET_STONE_BRICKS.asItem())));
        createStairsRecipe(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.VIOLET_STONE_BRICKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.VIOLET_STONE_BRICKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.VIOLET_STONE_BRICKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.VIOLET_STONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.VIOLET_STONE_BRICKS);

        //Deep Violet Stone
        createStairsRecipe(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.DEEP_VIOLET_STONE.asItem()))
                .criterion(hasItem(OuterWorldBlocks.DEEP_VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.DEEP_VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB, OuterWorldBlocks.DEEP_VIOLET_STONE);
        offerSingleOutputShapelessRecipe(exporter, OuterWorldBlocks.DEEP_VIOLET_STONE_BUTTON, OuterWorldBlocks.DEEP_VIOLET_STONE, "outer_world_blocks");
        offerPressurePlateRecipe(exporter, OuterWorldBlocks.DEEP_VIOLET_STONE_PRESSURE_PLATE, OuterWorldBlocks.DEEP_VIOLET_STONE);

        createStairsRecipe(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE.asItem()))
                .criterion(hasItem(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS, 4)
                .pattern("MM ")
                .pattern("MM ")
                .pattern("   ")
                .input('M', OuterWorldBlocks.DEEP_VIOLET_STONE.asItem())
                .criterion(hasItem(OuterWorldBlocks.DEEP_VIOLET_STONE.asItem()),
                        conditionsFromItem(OuterWorldBlocks.DEEP_VIOLET_STONE.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS.asItem())));
        createStairsRecipe(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS.asItem(), Ingredient.ofItems(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS.asItem()))
                .criterion(hasItem(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS.asItem()),
                        conditionsFromItem(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS.asItem())));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);

        //Ruby Tools and Armor
        //Ruby + Ruby Block
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldItems.RUBY,
                RecipeCategory.DECORATIONS, OuterWorldBlocks.RUBY_BLOCK);

        //Ruby Helmet
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_HELMET, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("   ")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_HELMET)));

        //Ruby Chestplate
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_CHESTPLATE, 1)
                .pattern("R R")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_CHESTPLATE)));

        //Ruby Leggings
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_LEGGINGS, 1)
                .pattern("RRR")
                .pattern("R R")
                .pattern("R R")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_LEGGINGS)));

        //Ruby Boots
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, OuterWorldItems.RUBY_BOOTS, 1)
                .pattern("R R")
                .pattern("R R")
                .pattern("   ")
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_BOOTS)));

        //Ruby Sword
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_SWORD, 1)
                .pattern(" R ")
                .pattern(" R ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_SWORD)));

        //Ruby Pickaxe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_PICKAXE, 1)
                .pattern("RRR")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_PICKAXE)));

        //Ruby Axe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_AXE, 1)
                .pattern(" RR")
                .pattern(" SR")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_AXE)));

        //Ruby Shovel
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_SHOVEL, 1)
                .pattern(" R ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_SHOVEL)));

        //Ruby Hoe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, OuterWorldItems.RUBY_HOE, 1)
                .pattern("RR ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', OuterWorldItems.RUBY)
                .criterion(hasItem(OuterWorldItems.RUBY),
                        conditionsFromItem(OuterWorldItems.RUBY))
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(OuterWorldItems.RUBY_HOE)));


        /*
         *Smelting/Blasting Recipes
         */

        //Violet Stone
        offerSmelting(exporter, List.of(OuterWorldBlocks.COBBLED_VIOLET_STONE), RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE, 0.7f, 200, "outer_world_blocks");
        offerSmelting(exporter, List.of(OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE), RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE, 0.7f, 200, "outer_world_blocks");

        offerSmelting(exporter, List.of(OuterWorldBlocks.VIOLET_STONE_RUBY_ORE), RecipeCategory.MISC, OuterWorldItems.RUBY, 0.7f, 200, "outer_world_blocks");
        offerSmelting(exporter, List.of(OuterWorldBlocks.DEEP_VIOLET_STONE_RUBY_ORE), RecipeCategory.MISC, OuterWorldItems.RUBY, 0.7f, 200, "outer_world_blocks");

        //offerBlasting(exporter, List.of(OuterWorldBlocks.COBBLED_VIOLET_STONE), RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE, 0.7f, 100, "outer_world_blocks");



        /*
         *Stone Cutter Recipes
         */

        //Violet Stone Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS, OuterWorldBlocks.VIOLET_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.VIOLET_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.VIOLET_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_STAIRS, OuterWorldBlocks.VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_SLAB, OuterWorldBlocks.VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_STAIRS, OuterWorldBlocks.VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.VIOLET_STONE_BRICKS, OuterWorldBlocks.VIOLET_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_VIOLET_STONE_STAIRS, OuterWorldBlocks.COBBLED_VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_VIOLET_STONE_SLAB, OuterWorldBlocks.COBBLED_VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_VIOLET_STONE_WALL, OuterWorldBlocks.COBBLED_VIOLET_STONE);

        //Deep Violet Stone Blocks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_STAIRS, OuterWorldBlocks.DEEP_VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_SLAB, OuterWorldBlocks.DEEP_VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_WALL, OuterWorldBlocks.DEEP_VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_STAIRS, OuterWorldBlocks.DEEP_VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICK_SLAB, OuterWorldBlocks.DEEP_VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS, OuterWorldBlocks.DEEP_VIOLET_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_STAIRS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_SLAB, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE, 2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE_WALL, OuterWorldBlocks.COBBLED_DEEP_VIOLET_STONE);

    }
}
