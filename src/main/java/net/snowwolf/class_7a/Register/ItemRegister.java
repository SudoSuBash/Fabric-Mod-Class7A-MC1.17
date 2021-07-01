package net.snowwolf.class_7a.Register;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.recipe.Ingredient;
import net.snowwolf.class_7a.Armor.BlackpeopleArmor;
import net.snowwolf.class_7a.BlockList;
import net.snowwolf.class_7a.FoodList;
import net.snowwolf.class_7a.ItemGroupList;
import net.snowwolf.class_7a.ItemList;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snowwolf.class_7a.Tier.AfricaQueenTier.*;
import net.snowwolf.class_7a.Tier.MainTier;

public class ItemRegister implements ModInitializer {
    public static final String MOD_ID="class_7a";
    @Override
    public void onInitialize() {
        //开头:其他
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_bone"),
                ItemList.africaqueen_bone);

        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_head"),
                new BlockItem(
                    BlockList.africaqueen_head,
                    new Item.Settings().group(ItemGroupList.africaqueengroup)
        ));
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_meat"),
                new Item(
                        new Item.Settings()
                                .group(ItemGroupList.africaqueengroup)
                                .food(FoodList.blackpeople_meat))
        );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_head"),
                new BlockItem(
                        BlockList.blackpeople_head,
                        new Item.Settings().group(ItemGroupList.africaqueengroup)
                )
        );
        //结束
        //开头:黑人套装
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_armor_head"),
                new BlackpeopleArmor(BlackpeopleArmor.armor, EquipmentSlot.HEAD)
                );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_armor_chest"),
                new BlackpeopleArmor(BlackpeopleArmor.armor, EquipmentSlot.CHEST)
                );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_armor_leg"),
                new BlackpeopleArmor(BlackpeopleArmor.armor, EquipmentSlot.LEGS)
                );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"blackpeople_armor_foot"),
                new BlackpeopleArmor(BlackpeopleArmor.armor, EquipmentSlot.FEET)
                );
        //结束
        //开头:非洲女王工具
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_axe"),
                new axe(new MainTier(
                        1,
                        300,
                        5.0f,
                        0f,
                        10,
                        Ingredient.ofItems(BlockList.africaqueen_head.asItem()
                        )))//用某个物品修复
                );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_hoe"),
                new hoe(new MainTier(
                        1,
                        300,
                        5.0f,
                        0f,
                        10,
                        Ingredient.ofItems(BlockList.africaqueen_head.asItem()
                        )))//用某个物品修复
        );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_pickaxe"),
                new pickaxe(new MainTier(
                        1,
                        300,
                        5.0f,
                        0f,
                        10,
                        Ingredient.ofItems(BlockList.africaqueen_head.asItem()
                        )))//用某个物品修复
        );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_sword"),
                new sword(new MainTier(
                        1,
                        300,
                        5.0f,
                        0f,
                        10,
                        Ingredient.ofItems(BlockList.africaqueen_head.asItem()
                        )))//用某个物品修复
        );
        Registry.register(
                Registry.ITEM,
                new Identifier(MOD_ID,"africaqueen_shovel"),
                new shovel(new MainTier(
                        1,
                        300,
                        5.0f,
                        0f,
                        10,
                        Ingredient.ofItems(BlockList.africaqueen_head.asItem()
                        )))//用某个物品修复
        );
        //结束
    }
}
