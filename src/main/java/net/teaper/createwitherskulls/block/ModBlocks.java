package net.teaper.createwitherskulls.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.createwitherskulls.CreateWitherSkulls;

import static net.minecraft.util.registry.Registry.register;

public class ModBlocks {
    public static final Block COAL_DUST_BLOCK = registerBlock("coal_dust_block",
            new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ItemGroup.BUILDING_BLOCKS);
    public static final Block EMBER_BLOCK = registerBlock("ember_block",
            new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).sounds(BlockSoundGroup.SAND).luminance(1)), ItemGroup.BUILDING_BLOCKS);
    private static Block registerBlock(String name, Block block, ItemGroup itemGroup) {
        registerBlockItem(name, block, itemGroup);
        return register(Registry.BLOCK, new Identifier(CreateWitherSkulls.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return register(Registry.ITEM, new Identifier(CreateWitherSkulls.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        CreateWitherSkulls.LOGGER.debug("Registering ModBlocks for " + CreateWitherSkulls.MOD_ID);
    }
}
