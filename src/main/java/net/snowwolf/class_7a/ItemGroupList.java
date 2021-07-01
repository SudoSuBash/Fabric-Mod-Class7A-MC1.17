package net.snowwolf.class_7a;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ItemGroupList {
    public static final ItemGroup africaqueengroup= FabricItemGroupBuilder.build(new Identifier("class_7a","africaqueen_blackpeople_group"),()->new ItemStack(ItemList.africaqueen_bone));
}
