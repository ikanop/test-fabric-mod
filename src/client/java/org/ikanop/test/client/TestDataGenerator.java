package org.ikanop.test.client;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class TestDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(EnglishLangProvider::new);
        pack.addProvider(ItemModelProvider::new);
        pack.addProvider(ItemTagProvider::new);
        pack.addProvider(TestRecipeProvider::new);
    }
}
