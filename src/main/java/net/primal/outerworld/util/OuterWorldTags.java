package net.primal.outerworld.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.primal.outerworld.OuterWorld;

public class OuterWorldTags {
    public static class Blocks {
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(OuterWorld.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> AUTUMN_MAPLE_LOGS =
                createTag("autumn_maple_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(OuterWorld.MOD_ID, name));
        }
    }
}