package fr.skyle.whatishappeningmod.blocks;

import fr.skyle.whatishappeningmod.ModWIHM;
import fr.skyle.whatishappeningmod.blocks.commonBlocks.BlockDream;
import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

import java.util.ArrayList;
import java.util.List;

public class WIHMBlocks {

    public static final List<Block> BLOCKS = new ArrayList();

    // --- LIST OF BLOCKS ---
    public static final Block DREAM_BLOCK = new BlockDream(Material.ROCK);

    // --- SPECIFIC FUNCTIONS ---
    public static void createAndRegisterItemFromBlock(Block block, String name) {
        block.setRegistryName(ModWIHM.MODID, name).setUnlocalizedName(ModWIHM.MODID + "." + name);
        BLOCKS.add(block);
        Item item = new ItemBlock(block);
        WIHMItems.createAndRegisterItem(item, name);
    }
}
