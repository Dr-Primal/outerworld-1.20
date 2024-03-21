package net.primal.outerworld;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.minecraft.block.ComposterBlock;
import net.primal.outerworld.block.OuterWorldBlocks;
import net.primal.outerworld.entity.OuterWorldBoats;
import net.primal.outerworld.item.OuterWorldItemGroups;
import net.primal.outerworld.item.OuterWorldItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OuterWorld implements ModInitializer {
	public static final String MOD_ID = "outerworld";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		OuterWorldBlocks.registerOWBlocks();
		OuterWorldItemGroups.registerItemGroups();
		OuterWorldItems.registerOWItems();
		OuterWorldBoats.registerBoats();

		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(OuterWorldBlocks.AUTUMN_MAPLE_SAPLING.asItem(), 0.3f);
		ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(OuterWorldItems.AUTUMN_SAMARA, 0.65f);

		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.AUTUMN_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.AUTUMN_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.STRIPPED_AUTUMN_MAPLE_WOOD, 5, 5);

		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.AUTUMN_MAPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(OuterWorldBlocks.AUTUMN_MAPLE_LEAVES, 30, 60);

		LOGGER.info("To the Outer World and Beyond!!!");
	}
}