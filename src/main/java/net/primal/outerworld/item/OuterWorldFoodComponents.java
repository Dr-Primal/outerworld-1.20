package net.primal.outerworld.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class OuterWorldFoodComponents {
    public static final FoodComponent AUTUMN_SAMARA =
            new FoodComponent.Builder().hunger(2).saturationModifier(0.20f).snack().build();

    /*public static final FoodComponent TOMATO = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();*/
}
