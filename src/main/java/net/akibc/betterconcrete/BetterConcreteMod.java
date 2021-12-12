package net.akibc.betterconcrete;

import net.akibc.betterconcrete.blocks.ModBlocks;
import net.akibc.betterconcrete.items.ModItems;
import net.fabricmc.api.ModInitializer;

public class BetterConcreteMod implements ModInitializer {
	public static final String MOD_ID = "akibc";

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
