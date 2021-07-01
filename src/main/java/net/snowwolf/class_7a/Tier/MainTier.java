package net.snowwolf.class_7a.Tier;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class MainTier implements ToolMaterial {
    private final int Level;//挖掘等级
    private final int maxUses;//耐久
    private final float speed;//效率
    private final float attackdamage;//攻击力
    private final int enchantmentvalue;//附魔等级
    private final Ingredient repairmaterial;//修复材质
    public MainTier(int level, int maxuses, float speed, float attackdamage, int enchantmentvalue, Ingredient repairmaterial) {
        this.Level=level;
        this.maxUses=maxuses;
        this.speed=speed;
        this.attackdamage=attackdamage;
        this.enchantmentvalue=enchantmentvalue;
        this.repairmaterial=repairmaterial;
    }

    @Override
    public int getDurability() {
        return maxUses;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return speed;
    }

    @Override
    public float getAttackDamage() {
        return attackdamage;
    }

    @Override
    public int getMiningLevel() {
        return Level;
    }

    @Override
    public int getEnchantability() {
        return enchantmentvalue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairmaterial;
    }
}
