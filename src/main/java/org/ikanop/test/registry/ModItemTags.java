package org.ikanop.test.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.ikanop.test.Test;

public class ModItemTags {
    public static final TagKey<Item> REPAIRS_AMETHYST =
            TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(Test.MOD_ID, "repairs_amethyst"));
}
