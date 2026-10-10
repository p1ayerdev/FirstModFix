package mymod.datagen;

import mymod.block.ModBlocks;
import mymod.item.CustomItems;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.HolderLookup;

import javax.naming.directory.ModificationItem;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootSubProvider {


    public ModBlockLootTableProvider(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(packOutput, registriesFuture);
    }

    @Override
    public void generate() {

        dropSelf(ModBlocks.RUBY_BLOCK);
        dropSelf(ModBlocks.SAPPHIRE_BLOCK);
        dropSelf(ModBlocks.TITANIUM_ORE);
        dropSelf(ModBlocks.TITANIUM_BLOCK);
        add(ModBlocks.RUBY_ORE, createOreDrop(ModBlocks.RUBY_ORE, CustomItems.RUBY));
    }
}
