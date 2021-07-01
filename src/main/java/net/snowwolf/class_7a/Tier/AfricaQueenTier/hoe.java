package net.snowwolf.class_7a.Tier.AfricaQueenTier;

import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.snowwolf.class_7a.ItemGroupList;

public class hoe extends HoeItem {

    public hoe(ToolMaterial material) {
        super(material,0,-2.9f,new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
