package fr.skyle.whatishappeningmod.world;

import fr.skyle.whatishappeningmod.ModWIHM;
import fr.skyle.whatishappeningmod.world.dream.biome.DreamBiome;
import fr.skyle.whatishappeningmod.world.dream.dimension.DreamDimension;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class WIHMBiomes {

    // --- LIST OF BIOMES ---
    public final static DreamBiome DREAM_BIOME = new DreamBiome();

    // --- SPECIFIC FUNCTIONS ---
    public static void initBiomes() {
        initBiome(DREAM_BIOME, DreamDimension.DIM_NAME, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.MAGICAL);
    }

    public static Biome initBiome(Biome biome, String name, BiomeManager.BiomeType biomeType, BiomeDictionary.Type... types) {
        biome.setRegistryName(ModWIHM.MODID, name);
        ForgeRegistries.BIOMES.register(biome);

        System.out.println("Biome " + name + " registered");

        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);

        System.out.println("Biome " + name + " added");

        return biome;
    }
}
