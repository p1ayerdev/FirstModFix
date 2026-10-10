package mymod.gemstab;

import mymod.MyMod;
import mymod.block.ModBlocks;
import mymod.item.CustomItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final CreativeModeTab GEMS_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MyMod.MOD_ID, "gems"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(CustomItems.SAPPHIRE))
                    .title(Component.translatable("creativemodetab.mymod.gems"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.RUBY_ORE);
                        output.accept(CustomItems.SAPPHIRE);
                        output.accept(ModBlocks.SAPPHIRE_BLOCK);
                        output.accept(CustomItems.RUBY);
                        output.accept(ModBlocks.RUBY_BLOCK);
                        output.accept(ModBlocks.TITANIUM_ORE);
                        output.accept(CustomItems.TITANIUM_INGOT);
                        output.accept(ModBlocks.TITANIUM_BLOCK);


                    }).build());


    public static void registerModCreativeModeTabs() {
        MyMod.LOGGER.info("Registering Creative Mode Tabs for " + MyMod.MOD_ID);
    }

}
