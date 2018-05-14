package fr.skyle.whatishappeningmod.items.commonItems;

import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemYellowCristal extends Item {

    public static final String NAME = "yellow_cristal";

    public ItemYellowCristal() {
        super();

        WIHMItems.createAndRegisterItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(2);
    }
}
