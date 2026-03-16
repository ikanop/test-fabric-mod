package org.ikanop.test.registry;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistryBuilder;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import org.ikanop.test.Test;

public class ModPotions {
    public static final Holder<Potion> TATER_POTION =
            Registry.registerForHolder(
                    BuiltInRegistries.POTION,
                    Identifier.fromNamespaceAndPath(Test.MOD_ID, "tater"),
                    new Potion("tater",
                            new MobEffectInstance(
                                    ModEffects.TATER,
                                    3600,
                                    0
                            )
                    )
            );

    public static void init() {
        FabricBrewingRecipeRegistryBuilder.BUILD.register(builder ->
            builder.addMix(
                    Potions.WATER,
                    Items.POTATO,
                    TATER_POTION
            ));
    }
}
