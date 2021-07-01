package net.snowwolf.class_7a.Tier.AfricaQueenTier;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.snowwolf.class_7a.ItemGroupList;

public class pickaxe extends PickaxeItem {
    public pickaxe(ToolMaterial material) {
        super(material, 2,-2.5f,new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
