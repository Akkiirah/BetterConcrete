package net.akibc.betterconcrete.items;

import net.akibc.betterconcrete.BetterConcreteMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // public static final Item WHITE_CONCRETE_STAIRS
    // =registerItem("white_concrete_stairs", new Item(new
    // FabricItemSettings().fireproof().group(ItemGroup.BUILDING_BLOCKS)))

    private static Item registerItem(String _name, Item _item) {
        return Registry.register(Registry.ITEM, new Identifier(BetterConcreteMod.MOD_ID, _name), _item);
    }

    public static void registerModItems() {
        System.out.println("Registering ModBlocks for " + BetterConcreteMod.MOD_ID);
    }

}
