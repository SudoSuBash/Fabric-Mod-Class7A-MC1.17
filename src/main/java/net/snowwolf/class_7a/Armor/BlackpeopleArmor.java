package net.snowwolf.class_7a.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvents;
import net.snowwolf.class_7a.BlockList;
import net.snowwolf.class_7a.ItemGroupList;

public class BlackpeopleArmor extends ArmorItem {
    public static final MainArmor armor=new MainArmor(
            new int[]{13,15,16,11},
            "blackpeople_armor",
            14,
            new int[]{3,5,7,2},
            4,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0,
            0,
            Ingredient.ofItems(BlockList.blackpeople_head.asItem())

    );
    public BlackpeopleArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(ItemGroupList.africaqueengroup));
    }
}
