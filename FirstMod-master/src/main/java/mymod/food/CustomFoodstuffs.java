package mymod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class CustomFoodstuffs {

    public static final FoodProperties GULAB_JAMUN = new FoodProperties.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodProperties GUMMY_BEAR = new FoodProperties.Builder().nutrition(1).saturationModifier(0.1f).build();

    public static final Consumable GULAB_JAMUN_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(2f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 200),1f)).build();

    public static final Consumable GUMMY_BEAR_CONSUMABLE = Consumables.defaultFood()
            .consumeSeconds(1f).onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.SPEED, 190),1)).build();
}
