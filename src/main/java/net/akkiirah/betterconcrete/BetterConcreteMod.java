package net.akkiirah.betterconcrete;

import net.akkiirah.betterconcrete.blocks.ModBlocks;
import net.fabricmc.api.ModInitializer;

public class BetterConcreteMod implements ModInitializer {
	public static final String MOD_ID = "akkiirah";

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
	}
}
