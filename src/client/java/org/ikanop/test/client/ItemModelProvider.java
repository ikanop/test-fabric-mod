package org.ikanop.test.client;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.ikanop.test.item.ModItems;

public class ItemModelProvider extends FabricModelProvider {
    public ItemModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        itemModelGenerator.generateFlatItem(ModItems.GOLDEN_BREAD, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.SUSPICIOUS_SUBSTANCE, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.CUSTOM_SPAWN_EGG, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_HELMET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_CHESTPLATE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_LEGGINGS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_BOOTS, ModelTemplates.FLAT_ITEM);

        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.AMETHYST_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
    }
}
