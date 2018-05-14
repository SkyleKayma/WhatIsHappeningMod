package fr.skyle.whatishappeningmod.items;

import fr.skyle.whatishappeningmod.ModWIHM;
import fr.skyle.whatishappeningmod.blocks.WIHMBlocks;
import fr.skyle.whatishappeningmod.items.commonItems.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(value = Side.CLIENT, modid = ModWIHM.MODID)
public class WIHMItems {

    public static final List<Item> ITEMS = new ArrayList();

    // --- LIST OF ITEMS ---
    public static final Item OLD_CRISTAL = new ItemOldCristal();
    public static final Item BLUE_CRISTAL = new ItemBlueCristal();
    public static final Item RED_CRISTAL = new ItemRedCristal();
    public static final Item YELLOW_CRISTAL = new ItemYellowCristal();
    public static final Item GREEN_CRISTAL = new ItemGreenCristal();
    public static final Item SUN_CRISTAL = new ItemSunCristal();
    public static final Item MOON_CRISTAL = new ItemMoonCristal();
    public static final Item ROCK_CRISTAL = new ItemRockCristal();
    public static final Item STRANGE_CRISTAL = new ItemStrangeCristal();
    public static final Item SPECIAL_CRISTAL = new ItemSpecialCristal();

    // --- LIST OF ITEMBLOCKS
    public static final Item BLOCK_DREAM_ITEM = new ItemBlock(WIHMBlocks.DREAM_BLOCK);

    // --- SPECIFIC FUNCTIONS ---
    public static void createAndRegisterItem(Item item, String name) {
        item.setRegistryName(ModWIHM.MODID, name).setUnlocalizedName(ModWIHM.MODID + "." + name);
        ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onRegisterItemModels(ModelRegistryEvent event) {
        for (Item item : ITEMS) {
            registerModel(item, 0);
        }
//        for (Block block : WIHMBlocks.BLOCKS) {
//            Item item = new ItemBlock(block);
//            WIHMItems.createAndRegisterItem(item, "test");
//        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item, int metadata) {
        if (metadata < 0) metadata = 0;
        String resourceName = item.getUnlocalizedName().substring(5).replace('.', ':');
        if (metadata > 0) resourceName += "_m" + String.valueOf(metadata);

        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(resourceName, "inventory"));
    }
}
