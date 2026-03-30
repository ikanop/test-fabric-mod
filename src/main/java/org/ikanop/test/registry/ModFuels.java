package org.ikanop.test.registry;

import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import org.ikanop.test.item.ModItems;

public final class ModFuels {
    public static void init() {
        FuelRegistryEvents.BUILD.register((builder, context) ->
            builder.add(ModItems.SUSPICIOUS_SUBSTANCE, 30 * 20));
    }
}
