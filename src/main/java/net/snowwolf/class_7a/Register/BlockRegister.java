package net.snowwolf.class_7a.Register;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snowwolf.class_7a.BlockList;


public class BlockRegister implements ModInitializer {

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK,new Identifier(ItemRegister.MOD_ID,"africaqueen_head"),
                BlockList.africaqueen_head);
        Registry.register(Registry.BLOCK,new Identifier(ItemRegister.MOD_ID,"blackpeople_head"),
                BlockList.blackpeople_head);
    }
}
