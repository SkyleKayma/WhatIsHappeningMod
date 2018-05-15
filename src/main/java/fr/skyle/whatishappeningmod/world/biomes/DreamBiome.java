package fr.skyle.whatishappeningmod.world.biomes;

import fr.skyle.whatishappeningmod.world.dimensions.dream.DreamDimension;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;

public class DreamBiome extends Biome {
    public DreamBiome() {
        super(new BiomeProperties(DreamDimension.DIM_NAME)
                .setBaseHeight(1.0F)
                .setHeightVariation(0.2F)
                .setRainDisabled()
                .setTemperature(0.2F)
                .setWaterColor(9754879)
        );

        topBlock = Blocks.OBSIDIAN.getDefaultState();
        fillerBlock = Blocks.STONE.getDefaultState();

        decorator.treesPerChunk = 2;

        spawnableCaveCreatureList.clear();
        spawnableCreatureList.clear();
        spawnableMonsterList.clear();
        spawnableWaterCreatureList.clear();

        spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 10, 1, 5));
    }
}