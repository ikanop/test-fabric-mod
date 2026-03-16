package org.ikanop.test.registry;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import org.ikanop.test.item.ModItems;

public final class ModCreativeTabs {
    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
                .register((itemGroup) -> itemGroup.accept(ModItems.SUSPICIOUS_SUBSTANCE));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FOOD_AND_DRINKS)
                .register((itemGroup) -> itemGroup.accept(ModItems.GOLDEN_BREAD));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS)
                .register((itemGroup) -> itemGroup.accept(ModItems.CUSTOM_SPAWN_EGG));

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> {
                    itemGroup.accept(ModItems.AMETHYST_PICKAXE);
                    itemGroup.accept(ModItems.AMETHYST_AXE);
                    itemGroup.accept(ModItems.AMETHYST_HOE);
                    itemGroup.accept(ModItems.AMETHYST_SHOVEL);
                });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> {
                    itemGroup.accept(ModItems.AMETHYST_SWORD);
                    itemGroup.accept(ModItems.AMETHYST_HELMET);
                    itemGroup.accept(ModItems.AMETHYST_CHESTPLATE);
                    itemGroup.accept(ModItems.AMETHYST_LEGGINGS);
                    itemGroup.accept(ModItems.AMETHYST_BOOTS);
                });
    }
}