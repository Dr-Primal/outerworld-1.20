package net.primal.outerworld.world.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.primal.outerworld.world.OuterWorldConfiguredFeatures;
import org.jetbrains.annotations.Nullable;

public class AutumnMapleSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(net.minecraft.util.math.random.Random random, boolean bees) {
        return OuterWorldConfiguredFeatures.AUTUMN_MAPLE_KEY;
    }
}
