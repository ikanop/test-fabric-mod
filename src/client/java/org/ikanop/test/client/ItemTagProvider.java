package org.ikanop.test.client;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import org.ikanop.test.item.ModItems;
import org.ikanop.test.registry.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ItemTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        valueLookupBuilder(ModItemTags.REPAIRS_AMETHYST)
                .add(ModItems.AMETHYST_SWORD)
                .add(ModItems.AMETHYST_PICKAXE)
                .add(ModItems.AMETHYST_AXE)
                .add(ModItems.AMETHYST_HOE)
                .add(ModItems.AMETHYST_SHOVEL)
                .add(ModItems.AMETHYST_HELMET)
                .add(ModItems.AMETHYST_CHESTPLATE)
                .add(ModItems.AMETHYST_LEGGINGS)
                .add(ModItems.AMETHYST_BOOTS);

        valueLookupBuilder(ItemTags.SWORDS).add(ModItems.AMETHYST_SWORD);
        valueLookupBuilder(ItemTags.PICKAXES).add(ModItems.AMETHYST_PICKAXE);
        valueLookupBuilder(ItemTags.AXES).add(ModItems.AMETHYST_AXE);
        valueLookupBuilder(ItemTags.HOES).add(ModItems.AMETHYST_HOE);
        valueLookupBuilder(ItemTags.SHOVELS).add(ModItems.AMETHYST_SHOVEL);
        valueLookupBuilder(ItemTags.HEAD_ARMOR).add(ModItems.AMETHYST_HELMET);
        valueLookupBuilder(ItemTags.CHEST_ARMOR).add(ModItems.AMETHYST_CHESTPLATE);
        valueLookupBuilder(ItemTags.LEG_ARMOR).add(ModItems.AMETHYST_LEGGINGS);
        valueLookupBuilder(ItemTags.FOOT_ARMOR).add(ModItems.AMETHYST_BOOTS);
    }
}
