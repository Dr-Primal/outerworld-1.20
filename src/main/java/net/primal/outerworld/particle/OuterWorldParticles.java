package net.primal.outerworld.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.primal.outerworld.OuterWorld;

public class OuterWorldParticles {
    public static final DefaultParticleType AUTUMN_MAPLE_LEAVES =
            registerParticle("autumn_maple_leaves", FabricParticleTypes.simple());


    private static DefaultParticleType registerParticle(String name, DefaultParticleType particleType) {
        return Registry.register(Registries.PARTICLE_TYPE, new Identifier(OuterWorld.MOD_ID, name), particleType);
    }

    public static void registerParticles() {
        OuterWorld.LOGGER.info("Registering Particles for " + OuterWorld.MOD_ID);
    }
}
