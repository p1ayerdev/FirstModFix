package mymod.datagen;

import mymod.block.ModBlocks;
import mymod.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new RecipeProvider(registries, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> TITANIUM_SMELTABLES = List.of(ModBlocks.TITANIUM_ORE);

                oreSmelting(TITANIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, CustomItems.TITANIUM_INGOT, 0.7f, 200, "titanium");
                oreBlasting(TITANIUM_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.BLOCKS, CustomItems.TITANIUM_INGOT, 0.7f, 100, "titanium");

                nineBlockStorageRecipes(RecipeCategory.MISC, CustomItems.TITANIUM_INGOT, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, CustomItems.RUBY, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK);
                nineBlockStorageRecipes(RecipeCategory.MISC, CustomItems.SAPPHIRE, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SAPPHIRE_BLOCK);

            }
        };
    }

    @Override
    public String getName() {
        return "My Fabric Mod Recipes";
    }
}
