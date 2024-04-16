package net.primal.outerworld.block;

import com.terraformersmc.terraform.sign.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.block.TerraformWallSignBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.custom.AutumnMapleLeavesBlock;
import net.primal.outerworld.world.tree.AutumnMapleSaplingGenerator;

public class OuterWorldBlocks {
    //Misc.
    public static final Block PURPLE_ICE = registerBlock("purple_ice",
            new IceBlock(FabricBlockSettings.copy(Blocks.BLUE_ICE)
                    .mapColor(MapColor.PURPLE)
                    .slipperiness(0.99f)
                    .ticksRandomly()
                    .strength(0.7f).sounds(BlockSoundGroup.GLASS)
                    .nonOpaque()
                    .allowsSpawning((state, world, pos, entityType) -> entityType == EntityType.POLAR_BEAR)
                    .solidBlock(Blocks::never)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copy(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.BRIGHT_RED)
                    .requiresTool()
                    .strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.METAL)));

    //Ores
    public static final Block VIOLET_STONE_RUBY_ORE = registerBlock("violet_stone_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(3.0f, 3.0f), UniformIntProvider.create(2, 5)));

    public static final Block DEEP_VIOLET_STONE_RUBY_ORE = registerBlock("deep_violet_stone_ruby_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(4.5f, 3.0f), UniformIntProvider.create(2, 5)));



    //Violet Stone
    public static final Block VIOLET_STONE = registerBlock("violet_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block VIOLET_STONE_STAIRS = registerBlock("violet_stone_stairs",
            new StairsBlock(VIOLET_STONE.getDefaultState(), FabricBlockSettings.copyOf(VIOLET_STONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLET_STONE_SLAB = registerBlock("violet_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block VIOLET_STONE_BUTTON = registerBlock("violet_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.PURPLE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block VIOLET_STONE_PRESSURE_PLATE = registerBlock("violet_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(0.5f),
                    BlockSetType.STONE));

    public static final Block COBBLED_VIOLET_STONE = registerBlock("cobbled_violet_stone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_VIOLET_STONE_STAIRS = registerBlock("cobbled_violet_stone_stairs",
            new StairsBlock(COBBLED_VIOLET_STONE.getDefaultState(), FabricBlockSettings.copyOf(COBBLED_VIOLET_STONE)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_VIOLET_STONE_SLAB = registerBlock("cobbled_violet_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block COBBLED_VIOLET_STONE_WALL = registerBlock("cobbled_violet_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.COBBLED_VIOLET_STONE).solid()
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block VIOLET_STONE_BRICKS = registerBlock("violet_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block VIOLET_STONE_BRICK_STAIRS = registerBlock("violet_stone_brick_stairs",
            new StairsBlock(VIOLET_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(VIOLET_STONE_BRICKS)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block VIOLET_STONE_BRICK_SLAB = registerBlock("violet_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block VIOLET_STONE_BRICK_WALL = registerBlock("violet_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.VIOLET_STONE_BRICKS)
                    .mapColor(MapColor.PURPLE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));
//Create Chiseled Violet Stone Brick TODO

    //Deep Violet Stone
    public static final Block DEEP_VIOLET_STONE = registerBlock("deep_violet_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_VIOLET_STONE_STAIRS = registerBlock("deep_violet_stone_stairs",
            new StairsBlock(VIOLET_STONE.getDefaultState(), FabricBlockSettings.copyOf(VIOLET_STONE)                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEP_VIOLET_STONE_SLAB = registerBlock("deep_violet_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block DEEP_VIOLET_STONE_BUTTON = registerBlock("deep_violet_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block DEEP_VIOLET_STONE_PRESSURE_PLATE = registerBlock("deep_violet_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(0.5f),
                    BlockSetType.STONE));

    public static final Block COBBLED_DEEP_VIOLET_STONE = registerBlock("cobbled_deep_violet_stone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_DEEP_VIOLET_STONE_STAIRS = registerBlock("cobbled_deep_violet_stone_stairs",
            new StairsBlock(COBBLED_VIOLET_STONE.getDefaultState(), FabricBlockSettings.copyOf(COBBLED_VIOLET_STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_DEEP_VIOLET_STONE_SLAB = registerBlock("cobbled_deep_violet_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block COBBLED_DEEP_VIOLET_STONE_WALL = registerBlock("cobbled_deep_violet_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.COBBLED_VIOLET_STONE)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));

    public static final Block DEEP_VIOLET_STONE_BRICKS = registerBlock("deep_violet_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_VIOLET_STONE_BRICK_STAIRS = registerBlock("deep_violet_stone_brick_stairs",
            new StairsBlock(VIOLET_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(VIOLET_STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEP_VIOLET_STONE_BRICK_SLAB = registerBlock("deep_violet_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block DEEP_VIOLET_STONE_BRICK_WALL = registerBlock("deep_violet_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.DEEP_VIOLET_STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_PURPLE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));



//Scorch Stone
    public static final Block SCORCH_STONE = registerBlock("scorch_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SCORCH_STONE_STAIRS = registerBlock("scorch_stone_stairs",
            new StairsBlock(SCORCH_STONE.getDefaultState(), FabricBlockSettings.copyOf(SCORCH_STONE)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SCORCH_STONE_SLAB = registerBlock("scorch_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block SCORCH_STONE_BUTTON = registerBlock("scorch_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.ORANGE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block SCORCH_STONE_PRESSURE_PLATE = registerBlock("scorch_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.ORANGE)
                            .requiresTool()
                            .strength(0.5f),
                    BlockSetType.STONE));

    public static final Block COBBLED_SCORCH_STONE = registerBlock("cobbled_scorch_stone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_SCORCH_STONE_STAIRS = registerBlock("cobbled_scorch_stone_stairs",
            new StairsBlock(COBBLED_SCORCH_STONE.getDefaultState(), FabricBlockSettings.copyOf(COBBLED_SCORCH_STONE)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_SCORCH_STONE_SLAB = registerBlock("cobbled_scorch_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block COBBLED_SCORCH_STONE_WALL = registerBlock("cobbled_scorch_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.COBBLED_SCORCH_STONE).solid()
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SCORCH_STONE_BRICKS = registerBlock("scorch_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SCORCH_STONE_BRICK_STAIRS = registerBlock("scorch_stone_brick_stairs",
            new StairsBlock(SCORCH_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(SCORCH_STONE_BRICKS)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block SCORCH_STONE_BRICK_SLAB = registerBlock("scorch_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)));

    public static final Block SCORCH_STONE_BRICK_WALL = registerBlock("scorch_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.SCORCH_STONE_BRICKS)
                    .mapColor(MapColor.ORANGE)
                    .requiresTool()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));
//Create Chiseled Scorch Stone Brick TODO

    //Deep Scorch Stone
    public static final Block DEEP_SCORCH_STONE = registerBlock("deep_scorch_stone",
            new Block(FabricBlockSettings.copy(Blocks.STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_SCORCH_STONE_STAIRS = registerBlock("deep_scorch_stone_stairs",
            new StairsBlock(SCORCH_STONE.getDefaultState(), FabricBlockSettings.copyOf(SCORCH_STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEP_SCORCH_STONE_SLAB = registerBlock("deep_scorch_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block DEEP_SCORCH_STONE_BUTTON = registerBlock("deep_scorch_stone_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.STONE, 20, false));
    public static final Block DEEP_SCORCH_STONE_PRESSURE_PLATE = registerBlock("deep_scorch_stone_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE)
                            .mapColor(MapColor.TERRACOTTA_ORANGE)
                            .requiresTool()
                            .strength(0.5f),
                    BlockSetType.STONE));

    public static final Block COBBLED_DEEP_SCORCH_STONE = registerBlock("cobbled_deep_scorch_stone",
            new Block(FabricBlockSettings.copy(Blocks.COBBLESTONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_DEEP_SCORCH_STONE_STAIRS = registerBlock("cobbled_deep_scorch_stone_stairs",
            new StairsBlock(COBBLED_SCORCH_STONE.getDefaultState(), FabricBlockSettings.copyOf(COBBLED_SCORCH_STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block COBBLED_DEEP_SCORCH_STONE_SLAB = registerBlock("cobbled_deep_scorch_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_SLAB)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block COBBLED_DEEP_SCORCH_STONE_WALL = registerBlock("cobbled_deep_scorch_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.COBBLED_SCORCH_STONE)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));

    public static final Block DEEP_SCORCH_STONE_BRICKS = registerBlock("deep_scorch_stone_bricks",
            new Block(FabricBlockSettings.copy(Blocks.STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DEEP_SCORCH_STONE_BRICK_STAIRS = registerBlock("deep_scorch_stone_brick_stairs",
            new StairsBlock(SCORCH_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(SCORCH_STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block DEEP_SCORCH_STONE_BRICK_SLAB = registerBlock("deep_scorch_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)));

    public static final Block DEEP_SCORCH_STONE_BRICK_WALL = registerBlock("deep_scorch_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(OuterWorldBlocks.DEEP_SCORCH_STONE_BRICKS)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .requiresTool()
                    .strength(3.5f, 6.0f)
                    .sounds(BlockSoundGroup.STONE)
                    .solid()));



    //Primuberant Wood Set
    public static final Block PRIMUBERANT_LOG = registerBlock("primuberant_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block PRIMUBERANT_WOOD = registerBlock("primuberant_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block STRIPPED_PRIMUBERANT_LOG = registerBlock("stripped_primuberant_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)
                    .mapColor(MapColor.YELLOW)
                    .strength(2f)));
    public static final Block STRIPPED_PRIMUBERANT_WOOD = registerBlock("stripped_primuberant_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)
                    .mapColor(MapColor.YELLOW)
                    .strength(2f)));

    public static final Block PRIMUBERANT_PLANKS = registerBlock("primuberant_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)));

    public static final Block PRIMUBERANT_STAIRS = registerBlock("primuberant_stairs",
            new StairsBlock(OuterWorldBlocks.PRIMUBERANT_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)));
    public static final Block PRIMUBERANT_SLAB = registerBlock("primuberant_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)
                    .mapColor(MapColor.BROWN)
                    .strength(2f)));

    public static final Block PRIMUBERANT_BUTTON = registerBlock("primuberant_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)
                    .mapColor(MapColor.BROWN)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.OAK, 30, true));
    public static final Block PRIMUBERANT_PRESSURE_PLATE = registerBlock("primuberant_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)
                    .mapColor(MapColor.BROWN)
                    .strength(0.5f),
                    BlockSetType.OAK));

    public static final Block PRIMUBERANT_FENCE = registerBlock("primuberant_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .mapColor(MapColor.BROWN)
                    .strength(2f)));
    public static final Block PRIMUBERANT_FENCE_GATE = registerBlock("primuberant_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)
                    .mapColor(MapColor.BROWN)
                    .strength(2f),
                    WoodType.OAK));

    public static final Block PRIMUBERANT_DOOR = registerBlock("primuberant_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .mapColor(MapColor.BROWN)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.OAK));
    public static final Block PRIMUBERANT_TRAPDOOR = registerBlock("primuberant_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .mapColor(MapColor.BROWN)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.OAK));

    public static final Identifier PRIMUBERANT_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "entity/signs/primuberant");
    public static final Identifier PRIMUBERANT_HANGING_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "entity/signs/hanging/primuberant");
    public static final Identifier PRIMUBERANT_HANGING_GUI_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "textures/gui/hanging_signs/primuberant");

    public static final Block STANDING_PRIMUBERANT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "primuberant_standing_sign"),
                    new TerraformSignBlock(PRIMUBERANT_SIGN_TEXTURE,
                            FabricBlockSettings.copy(Blocks.ACACIA_SIGN)
                                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block WALL_PRIMUBERANT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "primuberant_wall_sign"),
                    new TerraformWallSignBlock(PRIMUBERANT_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_SIGN)
                                    .dropsLike(STANDING_PRIMUBERANT_SIGN)
                                    .mapColor(MapColor.BROWN)));
    public static final Block HANGING_PRIMUBERANT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "primuberant_hanging_sign"),
                    new TerraformHangingSignBlock(PRIMUBERANT_HANGING_SIGN_TEXTURE, PRIMUBERANT_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_HANGING_SIGN)
                                    .mapColor(MapColor.BROWN)));
    public static final Block WALL_HANGING_PRIMUBERANT_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "primuberant_wall_hanging_sign"),
                    new TerraformWallHangingSignBlock(PRIMUBERANT_HANGING_SIGN_TEXTURE, PRIMUBERANT_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_HANGING_SIGN)
                                    .dropsLike(HANGING_PRIMUBERANT_SIGN)
                                    .mapColor(MapColor.BROWN)));

    public static final BlockFamily PRIMUBERANT_FAMILY =
            BlockFamilies.register(OuterWorldBlocks.PRIMUBERANT_PLANKS)
                    .sign(OuterWorldBlocks.STANDING_PRIMUBERANT_SIGN, OuterWorldBlocks.WALL_PRIMUBERANT_SIGN)
                    .group("wooden").unlockCriterionName("has_planks").build();

    //Autumn Maple Wood Set
    public static final Block AUTUMN_MAPLE_LOG = registerBlock("autumn_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block AUTUMN_MAPLE_WOOD = registerBlock("autumn_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)
                    .mapColor(MapColor.OAK_TAN)
                    .strength(2f)));
    public static final Block STRIPPED_AUTUMN_MAPLE_LOG = registerBlock("stripped_autumn_maple_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG)
                    .mapColor(MapColor.YELLOW)
                    .strength(2f)));
    public static final Block STRIPPED_AUTUMN_MAPLE_WOOD = registerBlock("stripped_autumn_maple_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD)
                    .mapColor(MapColor.YELLOW)
                    .strength(2f)));

    public static final Block AUTUMN_MAPLE_PLANKS = registerBlock("autumn_maple_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)));

    public static final Block AUTUMN_MAPLE_STAIRS = registerBlock("autumn_maple_stairs",
            new StairsBlock(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(2f)));
    public static final Block AUTUMN_MAPLE_SLAB = registerBlock("autumn_maple_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)));

    public static final Block AUTUMN_MAPLE_BUTTON = registerBlock("autumn_maple_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.OAK_BUTTON)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(0.5f)
                    .collidable(false),
                    BlockSetType.OAK, 30, true));
    public static final Block AUTUMN_MAPLE_PRESSURE_PLATE = registerBlock("autumn_maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.OAK_PRESSURE_PLATE)
                            .mapColor(MapColor.PALE_YELLOW)
                            .strength(0.5f),
                    BlockSetType.OAK));

    public static final Block AUTUMN_MAPLE_FENCE = registerBlock("autumn_maple_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)));
    public static final Block AUTUMN_MAPLE_FENCE_GATE = registerBlock("autumn_maple_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f),
                    WoodType.OAK));

    public static final Block AUTUMN_MAPLE_DOOR = registerBlock("autumn_maple_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.OAK));
    public static final Block AUTUMN_MAPLE_TRAPDOOR = registerBlock("autumn_maple_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)
                    .mapColor(MapColor.PALE_YELLOW)
                    .strength(2f)
                    .nonOpaque(),
                    BlockSetType.OAK));

    public static final Identifier AUTUMN_MAPLE_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "entity/signs/autumn_maple");
    public static final Identifier AUTUMN_MAPLE_HANGING_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "entity/signs/hanging/autumn_maple");
    public static final Identifier AUTUMN_MAPLE_HANGING_GUI_SIGN_TEXTURE =
            new Identifier(OuterWorld.MOD_ID, "textures/gui/hanging_signs/autumn_maple");

    public static final Block STANDING_AUTUMN_MAPLE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "autumn_maple_standing_sign"),
                    new TerraformSignBlock(AUTUMN_MAPLE_SIGN_TEXTURE,
                            FabricBlockSettings.copy(Blocks.ACACIA_SIGN)
                                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block WALL_AUTUMN_MAPLE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "autumn_maple_wall_sign"),
                    new TerraformWallSignBlock(AUTUMN_MAPLE_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_SIGN)
                                    .dropsLike(STANDING_AUTUMN_MAPLE_SIGN)
                                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block HANGING_AUTUMN_MAPLE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "autumn_maple_hanging_sign"),
                    new TerraformHangingSignBlock(AUTUMN_MAPLE_HANGING_SIGN_TEXTURE, AUTUMN_MAPLE_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_HANGING_SIGN)
                                    .mapColor(MapColor.PALE_YELLOW)));
    public static final Block WALL_HANGING_AUTUMN_MAPLE_SIGN =
            Registry.register(Registries.BLOCK,
                    new Identifier(OuterWorld.MOD_ID, "autumn_maple_wall_hanging_sign"),
                    new TerraformWallHangingSignBlock(AUTUMN_MAPLE_HANGING_SIGN_TEXTURE, AUTUMN_MAPLE_HANGING_GUI_SIGN_TEXTURE,
                            FabricBlockSettings.copyOf(Blocks.ACACIA_WALL_HANGING_SIGN)
                                    .dropsLike(HANGING_AUTUMN_MAPLE_SIGN)
                                    .mapColor(MapColor.PALE_YELLOW)));

    public static final BlockFamily AUTUMN_MAPLE_FAMILY =
            BlockFamilies.register(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS)
                    .sign(OuterWorldBlocks.STANDING_AUTUMN_MAPLE_SIGN, OuterWorldBlocks.WALL_AUTUMN_MAPLE_SIGN)
                    .group("wooden").unlockCriterionName("has_planks").build();

    //Leaves
    public static final Block AUTUMN_MAPLE_LEAVES = registerBlock("autumn_maple_leaves",
            new AutumnMapleLeavesBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LEAVES)
                    .mapColor(MapColor.TERRACOTTA_ORANGE)
                    .nonOpaque()));

    //Saplings
    public static final Block AUTUMN_MAPLE_SAPLING = registerBlock("autumn_maple_sapling",
            new SaplingBlock(new AutumnMapleSaplingGenerator(),
                    FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)
                            .mapColor(MapColor.TERRACOTTA_ORANGE)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OuterWorld.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(OuterWorld.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerOWBlocks() {
        OuterWorld.LOGGER.info("Registering OuterWorld Blocks for " + OuterWorld.MOD_ID);
    }
}