package org.ikanop.test.client;

import java.util.concurrent.CompletableFuture;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.world.item.Items;
import org.ikanop.test.item.ModItems;

public class TestRecipeProvider extends FabricRecipeProvider {
    public TestRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registryLookup, RecipeOutput exporter) {
        return new RecipeProvider(registryLookup, exporter) {
            @Override
            public void buildRecipes() {
                shaped(RecipeCategory.FOOD, ModItems.GOLDEN_BREAD, 4)
                        .pattern("GGG")
                        .pattern("GBG")
                        .pattern("GGG")
                        .define('G', Items.GOLD_BLOCK)
                        .define('B', Items.BREAD)
                        .unlockedBy(getHasName(Items.GOLD_BLOCK), has(Items.GOLD_BLOCK))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE, 1)
                        .pattern("AAA")
                        .pattern(" / ")
                        .pattern(" / ")
                        .define('/', Items.STICK)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SWORD, 1)
                        .pattern("A")
                        .pattern("A")
                        .pattern("/")
                        .define('/', Items.STICK)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE, 1)
                        .pattern("AA ")
                        .pattern("A/ ")
                        .pattern(" / ")
                        .define('/', Items.STICK)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE, 1)
                        .pattern("AA ")
                        .pattern(" / ")
                        .pattern(" / ")
                        .define('/', Items.STICK)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .save(output);

                shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL, 1)
                        .pattern(" A ")
                        .pattern(" / ")
                        .pattern(" / ")
                        .define('/', Items.STICK)
                        .define('A', Items.AMETHYST_SHARD)
                        .unlockedBy(getHasName(Items.AMETHYST_SHARD), has(Items.AMETHYST_SHARD))
                        .save(output);
            }
        };
    }

    @Override
    public String getName() {
        return "TestRecipeProvider";
    }
}