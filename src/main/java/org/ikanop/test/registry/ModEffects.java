package org.ikanop.test.registry;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;
import org.ikanop.test.Test;
import org.ikanop.test.effect.TaterEffect;

public class ModEffects {
    public static final Holder<MobEffect> TATER =
            Registry.registerForHolder(BuiltInRegistries.MOB_EFFECT, Identifier.fromNamespaceAndPath(Test.MOD_ID, "tater"), new TaterEffect());

    public static void init() {
    }
}

