package net.snowwolf.class_7a;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class FoodList {
    public static final FoodComponent blackpeople_meat=(new FoodComponent.Builder())
            .saturationModifier(15)
            .hunger(3)
            .statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK,1200,3),0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER,600,1),0.5f)
            .build();


}
