package fr.skyle.whatishappeningmod.blocks.commonBlocks;

import fr.skyle.whatishappeningmod.blocks.WIHMBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockDream extends Block {

    public static final String NAME = "dream_block";

    public BlockDream(Material materialIn) {
        super(materialIn);

        WIHMBlocks.createAndRegisterItemFromBlock(this, NAME);
        setResistance(100F);
        setHardness(0.2F);
        setCreativeTab(CreativeTabs.MISC);
    }
}