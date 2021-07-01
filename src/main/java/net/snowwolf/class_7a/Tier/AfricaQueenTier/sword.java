package net.snowwolf.class_7a.Tier.AfricaQueenTier;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.snowwolf.class_7a.ItemGroupList;

public class sword extends SwordItem {
    public sword(ToolMaterial toolMaterial) {
        super(toolMaterial, 3,-1.8f,new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
