package mymod.datagen;

import mymod.block.ModBlocks;
import mymod.item.CustomItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.SAPPHIRE_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_ORE);
        blockModelGenerators.createTrivialCube(ModBlocks.RUBY_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.TITANIUM_BLOCK);
        blockModelGenerators.createTrivialCube(ModBlocks.TITANIUM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(CustomItems.SAPPHIRE, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CustomItems.RUBY, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CustomItems.TITANIUM_INGOT, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CustomItems.GULAB_JAMUN, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(CustomItems.GUMMY_BEAR, ModelTemplates.FLAT_ITEM);
    }
}
