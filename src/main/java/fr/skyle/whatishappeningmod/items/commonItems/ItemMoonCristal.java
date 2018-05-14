package fr.skyle.whatishappeningmod.items.commonItems;

import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemMoonCristal extends Item {

    public static final String NAME = "moon_cristal";

    public ItemMoonCristal() {
        super();

        WIHMItems.createAndRegisterItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(2);
    }
}
