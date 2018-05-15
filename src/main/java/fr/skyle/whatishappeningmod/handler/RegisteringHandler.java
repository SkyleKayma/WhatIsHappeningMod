package fr.skyle.whatishappeningmod.handler;

import fr.skyle.whatishappeningmod.blocks.WIHMBlocks;
import fr.skyle.whatishappeningmod.items.WIHMItems;
import fr.skyle.whatishappeningmod.world.WIHMBiomes;
import fr.skyle.whatishappeningmod.world.WIHMDimensions;
import fr.skyle.whatishappeningmod.world.dimensions.dream.DreamWorldType;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegisteringHandler {

    @SubscribeEvent
    public void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(WIHMItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(WIHMBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public void onBiomeRegister(RegistryEvent.Register<Biome> event) {
        WIHMBiomes.initBiomes();
        WIHMDimensions.registerDimensions();
    }

    public static void postInitRegistries() {
        WorldType dreamWT = new DreamWorldType();
    }
}