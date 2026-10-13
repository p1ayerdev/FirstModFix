package mymod.item;

import mymod.MyMod;
import mymod.food.CustomFoodstuffs;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class CustomItems {

    public static final Item SAPPHIRE = registerItem("sapphire", Item::new);
    public static final Item RUBY = registerItem("ruby", Item::new);
    public static final Item TITANIUM_INGOT = registerItem("titanium_ingot", Item::new);
    public static final Item GULAB_JAMUN = registerItem("gulab_jamun", properties -> new Item(properties
            .food(CustomFoodstuffs.GULAB_JAMUN, CustomFoodstuffs.GULAB_JAMUN_CONSUMABLE)));
    public static final Item GUMMY_BEAR = registerItem("gummy_bear", properties -> new Item(properties
            .food(CustomFoodstuffs.GUMMY_BEAR, CustomFoodstuffs.GUMMY_BEAR_CONSUMABLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name)))));

    }


    public static void registerModItems(){
        MyMod.LOGGER.info("Registering Mod Items for: "+ MyMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(CustomItems.GULAB_JAMUN);
        });
    }

}
