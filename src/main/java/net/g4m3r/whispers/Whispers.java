package net.g4m3r.whispers;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.g4m3r.whispers.block.ModBlocks;
import net.g4m3r.whispers.item.ModItemGroups;
import net.g4m3r.whispers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Whispers implements ModInitializer {
	public static final String MOD_ID = "whispers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 100);
	}
}