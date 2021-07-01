package net.snowwolf.class_7a;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class BlockList {
    public static final Block africaqueen_head= new Block(
            FabricBlockSettings.of(Material.STONE)
            .breakByHand(false)
            .breakByTool(FabricToolTags.PICKAXES,1)
            .strength(1.5f,1)
            .sounds(BlockSoundGroup.STONE));
    		
    public static final Block blackpeople_head=new Block(
            FabricBlockSettings.of(Material.STONE)
            .breakByHand(true)
            .strength(1f, 0.8f)
            .sounds(BlockSoundGroup.STONE)
    );
}
