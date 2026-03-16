package org.ikanop.test.registry;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import org.ikanop.test.item.ModItems;

public final class ModComposting {
    public static void init() {
        CompostingChanceRegistry.INSTANCE.add(ModItems.SUSPICIOUS_SUBSTANCE, 0.3f);
    }
}
