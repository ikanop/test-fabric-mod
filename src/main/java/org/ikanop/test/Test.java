package org.ikanop.test;

import net.fabricmc.api.ModInitializer;
import org.ikanop.test.item.ModItems;
import org.ikanop.test.registry.*;

public class Test implements ModInitializer {
    public static final String MOD_ID = "test";

    @Override
    public void onInitialize() {
        ModItems.init();
        ModCreativeTabs.init();
        ModComposting.init();
        ModFuels.init();
        ModEffects.init();
        ModPotions.init();
    }
}