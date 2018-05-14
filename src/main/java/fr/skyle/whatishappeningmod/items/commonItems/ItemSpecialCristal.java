package fr.skyle.whatishappeningmod.items.commonItems;

import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSpecialCristal extends Item {

    public static final String NAME = "special_cristal";

    public ItemSpecialCristal() {
        super();

        WIHMItems.createAndRegisterItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(1);
    }
}