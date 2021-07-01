package net.snowwolf.class_7a.Tier.AfricaQueenTier;

import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.snowwolf.class_7a.ItemGroupList;

public class axe extends AxeItem {
    public axe(ToolMaterial material) {
        super(material,8,-3.1f,new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
