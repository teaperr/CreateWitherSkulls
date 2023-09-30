package net.teaper.createwitherskulls.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teaper.createwitherskulls.CreateWitherSkulls;

public class ModItems {
    public static final Item COAL_DUST = registerItem("coal_dust",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));
    public static final Item EMBER = registerItem("ember",
            new Item (new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CreateWitherSkulls.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateWitherSkulls.LOGGER.debug("Registering Mod Items for " + CreateWitherSkulls.MOD_ID);

    }
}
