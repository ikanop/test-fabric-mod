package org.ikanop.test.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.equipment.ArmorType;
import org.ikanop.test.Test;
import org.ikanop.test.registry.ModArmorMaterials;

import java.util.function.Function;

import static org.ikanop.test.registry.ModToolMaterials.AMETHYST_TOOL_MATERIAL;

public class ModItems {

    public static final Consumable GOLDEN_BREAD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HASTE, 60 * 20, 1), 1.0f))
            .build();

    public static final FoodProperties GOLDEN_BREAD_COMPONENT =
            new FoodProperties.Builder()
                    .nutrition(10)
                    .saturationModifier(0.6f)
                    .alwaysEdible()
                    .build();

    public static final Item GOLDEN_BREAD = register(
            "golden_bread",
            Item::new,
            new Item.Properties().food(GOLDEN_BREAD_COMPONENT, GOLDEN_BREAD_CONSUMABLE_COMPONENT)
    );

    public static final Item SUSPICIOUS_SUBSTANCE =
            register("suspicious_substance",
                    Item::new, new Item.Properties());

    public static final SpawnEggItem CUSTOM_SPAWN_EGG = register(
            "custom_spawn_egg",
            SpawnEggItem::new,
            new Item.Properties().spawnEgg(EntityType.FROG)
    );

    public static final Item AMETHYST_SWORD = register(
            "amethyst_sword",
            Item::new,
            new Item.Properties().sword(AMETHYST_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item AMETHYST_PICKAXE = register(
            "amethyst_pickaxe",
            Item::new,
            new Item.Properties().pickaxe(AMETHYST_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item AMETHYST_AXE = register(
            "amethyst_axe",
            Item::new,
            new Item.Properties().axe(AMETHYST_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item AMETHYST_HOE = register(
            "amethyst_hoe",
            Item::new,
            new Item.Properties().hoe(AMETHYST_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item AMETHYST_SHOVEL = register(
            "amethyst_shovel",
            Item::new,
            new Item.Properties().shovel(AMETHYST_TOOL_MATERIAL, 1f, 1f)
    );

    public static final Item AMETHYST_HELMET = register(
            "amethyst_helmet",
            Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.INSTANCE, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.BASE_DURABILITY))
    );
    public static final Item AMETHYST_CHESTPLATE = register(
            "amethyst_chestplate",
            Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.INSTANCE, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(ModArmorMaterials.BASE_DURABILITY))
    );

    public static final Item AMETHYST_LEGGINGS = register(
            "amethyst_leggings",
            Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.INSTANCE, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(ModArmorMaterials.BASE_DURABILITY))
    );

    public static final Item AMETHYST_BOOTS = register(
            "amethyst_boots",
            Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.INSTANCE, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(ModArmorMaterials.BASE_DURABILITY))
    );


    public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
        // Create the item key.
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Test.MOD_ID, name));

        // Create the item instance.
        T item = itemFactory.apply(settings.setId(itemKey));

        // Register the item.
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static void init() {

    }
}