package net.snowwolf.class_7a.Tier.AfricaQueenTier;

import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.snowwolf.class_7a.ItemGroupList;

public class shovel extends ShovelItem {
    public shovel(ToolMaterial material) {
        super(material,2f,-3f,new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
