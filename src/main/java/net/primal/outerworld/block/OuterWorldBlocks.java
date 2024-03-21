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
import net.primal.outerworld.OuterWorld;
import net.primal.outerworld.block.custom.AutumnMapleLeavesBlock;
import net.primal.outerworld.world.tree.AutumnMapleSaplingGenerator;

public class OuterWorldBlocks {
    public static final Block PURPLE_ICE = registerBlock("purple_ice",
            new GlassBlock(FabricBlockSettings.copy(Blocks.ICE)
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