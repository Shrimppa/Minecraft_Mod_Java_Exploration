package com.trenton.trentons_mod.item;

import com.trenton.trentons_mod.TrentonsMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.stringtemplate.v4.ST;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TrentonsMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> STRONG_COKE = ITEMS.register("strong_coke",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat().nutrition(10).saturationMod(10f).effect(() ->
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1200, 9), 1F).effect(() ->
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1200, 4), 1F).effect(() ->
                    new MobEffectInstance(MobEffects.JUMP, 1200, 7), 1F).effect(() ->
                    new MobEffectInstance(MobEffects.WITHER, 600, 2), 1F).build())));
}
