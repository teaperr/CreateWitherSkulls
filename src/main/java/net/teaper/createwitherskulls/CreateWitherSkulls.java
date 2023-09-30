package net.teaper.createwitherskulls;

import net.fabricmc.api.ModInitializer;
import net.teaper.createwitherskulls.block.ModFallingBlocks;
import net.teaper.createwitherskulls.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateWitherSkulls implements ModInitializer {
    public static final String MOD_ID = "createwitherskulls";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModFallingBlocks.registerModBlocks();
    }
}
