package org.ikanop.test.client;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.ikanop.test.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class EnglishLangProvider extends FabricLanguageProvider {
    protected EnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider holderLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.SUSPICIOUS_SUBSTANCE, "Suspicious Substance");

        translationBuilder.add(ModItems.GOLDEN_BREAD, "Golden Bread");

        translationBuilder.add(ModItems.CUSTOM_SPAWN_EGG, "Custom Spawn Egg");

        translationBuilder.add(ModItems.AMETHYST_PICKAXE, "Amethyst Pickaxe");
        translationBuilder.add(ModItems.AMETHYST_AXE, "Amethyst Axe");
        translationBuilder.add(ModItems.AMETHYST_HOE, "Amethyst Hoe");
        translationBuilder.add(ModItems.AMETHYST_SHOVEL, "Amethyst Shovel");

        translationBuilder.add(ModItems.AMETHYST_SWORD, "Amethyst Sword");
        translationBuilder.add(ModItems.AMETHYST_HELMET, "Amethyst Helmet");
        translationBuilder.add(ModItems.AMETHYST_CHESTPLATE, "Amethyst Chestplate");
        translationBuilder.add(ModItems.AMETHYST_LEGGINGS, "Amethyst Leggings");
        translationBuilder.add(ModItems.AMETHYST_BOOTS, "Amethyst Boots");

        translationBuilder.add("effect.test.tater", "Tater");
        translationBuilder.add("item.minecraft.potion.effect.tater", "Potion of Tater");
        translationBuilder.add("item.minecraft.splash_potion.effect.tater", "Splash Potion of Tater");
        translationBuilder.add("item.minecraft.lingering_potion.effect.tater", "Lingering Potion of Tater");
        translationBuilder.add("item.minecraft.tipped_arrow.effect.tater", "Arrow of Tater");
    }
}