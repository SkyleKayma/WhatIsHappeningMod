package fr.skyle.whatishappeningmod.world.type;

import fr.skyle.whatishappeningmod.world.dream.biome.DreamBiomeProvider;
import fr.skyle.whatishappeningmod.world.dream.dimension.DreamDimension;
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
