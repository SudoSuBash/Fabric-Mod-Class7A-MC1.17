package net.snowwolf.class_7a.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;



public class MainArmor implements ArmorMaterial {
    public final int[] MAX_DAMAGE_ARRAY;
    /*
     * 参数1:靴子
     * 参数2:护腿
     * 参数3:胸甲
     * 参数4:头盔
     * 适用于MAX_DAMAGE_ARRAY和maxDamageFactor
     */
    public final String name;
    public final int maxDamageFactor;//最大损伤
    public final int[] damageReductionAmountArray;//盔甲的增加量
    public final int enchantability;//附魔
    public final SoundEvent sevent;
    public final float toughness;//韧度
    public final float knockbackResistance;//击退
    public final Ingredient repairMaterial;//修复类型

    public MainArmor(int[] MAX_DAMAGE_ARRAY,String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent event, float toughness, float knockbackResistance, Ingredient repairMaterial) {
        this.MAX_DAMAGE_ARRAY=MAX_DAMAGE_ARRAY;
        this.name=name;
        this.maxDamageFactor=maxDamageFactor;
        this.damageReductionAmountArray=damageReductionAmountArray;
        this.enchantability=enchantability;
        this.sevent=event;
        this.toughness=toughness;
        this.knockbackResistance=knockbackResistance;
        this.repairMaterial=repairMaterial;
    }
    @Override
    public int getDurability(EquipmentSlot slot) {//耐久
        return MAX_DAMAGE_ARRAY[slot.getEntitySlotId()]*this.maxDamageFactor;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {//伤害减少量
        return damageReductionAmountArray[slot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {//附魔
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {//声音
        return sevent;
    }

    @Override
    public Ingredient getRepairIngredient() {//修复工具
        return repairMaterial;
    }

    @Override
    public String getName() {//名字
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {//击退
        return knockbackResistance;
    }
}
