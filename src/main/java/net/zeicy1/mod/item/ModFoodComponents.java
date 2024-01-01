package net.zeicy1.mod.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
   public static final FoodComponent GOLDEN_BAMBOO = (new FoodComponent.Builder()).hunger(6).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 2), 1.0F).alwaysEdible().build();
}