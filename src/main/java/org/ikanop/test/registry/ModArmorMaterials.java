package org.ikanop.test.registry;

import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import org.ikanop.test.Test;

import java.util.Map;

import static org.ikanop.test.registry.ModItemTags.REPAIRS_AMETHYST;

public class ModArmorMaterials {
    public static final int BASE_DURABILITY = 15;

    public static final ResourceKey<EquipmentAsset> AMETHYST_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(Test.MOD_ID, "amethyst"));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            5,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            REPAIRS_AMETHYST,
            AMETHYST_ARMOR_MATERIAL_KEY
    );
}
