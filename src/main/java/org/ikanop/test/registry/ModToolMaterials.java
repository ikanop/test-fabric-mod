package org.ikanop.test.registry;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {

    public static final ToolMaterial AMETHYST_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_IRON_TOOL,
            300,
            7F,
            3,
            30,
            ModItemTags.REPAIRS_AMETHYST
    );
}
