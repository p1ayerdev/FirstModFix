package mymod.block;

import mymod.MyMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class ModBlocks {

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            properties -> new Block(properties.strength(4f)
                    .requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE)));
    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHER_BRICKS)));
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            properties -> new Block(properties.strength(5f)
                    .requiresCorrectToolForDrops().sound(SoundType.CALCITE)));

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MyMod.MOD_ID, name)))));
    }

    public static void registerModBlocks() {
        MyMod.LOGGER.info("Registering Mod Blocks for "+ MyMod.MOD_ID);
    }
}
