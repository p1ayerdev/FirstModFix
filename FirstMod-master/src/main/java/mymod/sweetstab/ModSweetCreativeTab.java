package mymod.sweetstab;

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

public class ModSweetCreativeTab {

    public static final CreativeModeTab SWEETS_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MyMod.MOD_ID, "sweets"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(CustomItems.GUMMY_BEAR))
                    .title(Component.translatable("creativemodetab.mymod.sweets"))
                    .displayItems((parameters, output) -> {
                        output.accept(CustomItems.GULAB_JAMUN);
                        output.accept(CustomItems.GUMMY_BEAR);
                    }).build());


    public static void registerModCreativeModeTabs() {
        MyMod.LOGGER.info("Registering Sweet Items Tabs for " + MyMod.MOD_ID);
    }

}
