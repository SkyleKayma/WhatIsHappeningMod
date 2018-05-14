package fr.skyle.whatishappeningmod.items.commonItems;

import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGreenCristal extends Item {

    public static final String NAME = "green_cristal";

    public ItemGreenCristal() {
        super();

        WIHMItems.createAndRegisterItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(2);
    }
}
