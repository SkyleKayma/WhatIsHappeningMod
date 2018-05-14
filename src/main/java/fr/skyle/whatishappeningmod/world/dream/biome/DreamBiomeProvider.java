package fr.skyle.whatishappeningmod.world.dream.biome;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;

public class DreamBiomeProvider extends BiomeProviderSingle {

    public DreamBiomeProvider() {
        super(new DreamBiome());
    }
}
