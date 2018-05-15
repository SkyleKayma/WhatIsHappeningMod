package fr.skyle.whatishappeningmod.world.dimensions.dream;

import fr.skyle.whatishappeningmod.world.biomes.DreamBiomeProvider;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;

public class DreamWorldType extends WorldType {
    public DreamWorldType() {
        super(DreamDimension.DIM_NAME);
    }

    @Override
    public BiomeProvider getBiomeProvider(World world) {
        return new DreamBiomeProvider();
    }
}
