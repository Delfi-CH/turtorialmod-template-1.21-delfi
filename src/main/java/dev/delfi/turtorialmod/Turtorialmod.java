package dev.delfi.turtorialmod;

import dev.delfi.turtorialmod.block.ModBlocks;
import dev.delfi.turtorialmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Turtorialmod implements ModInitializer {
	public static final String MOD_ID = "turtorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}