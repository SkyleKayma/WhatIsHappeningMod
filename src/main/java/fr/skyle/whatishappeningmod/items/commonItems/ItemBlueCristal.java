package fr.skyle.whatishappeningmod.items.commonItems;

import fr.skyle.whatishappeningmod.items.WIHMItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBlueCristal extends Item {

    public static final String NAME = "blue_cristal";

    public ItemBlueCristal() {
        super();

        WIHMItems.createAndRegisterItem(this, NAME);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(2);
    }
}
