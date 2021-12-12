package net.akibc.betterconcrete.blocks;

import net.akibc.betterconcrete.blocks.ModStairsBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.akibc.betterconcrete.BetterConcreteMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModBlocks {

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new ModStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                    FabricBlockSettings.of(Material.STONE).hardness(1.8f).breakByTool(FabricToolTags.PICKAXES, 2)
                            .requiresTool()));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.8f).breakByTool(FabricToolTags.PICKAXES, 2)
                    .requiresTool()));

    private static Block registerBlock(String _name, Block _block) {
        registerBlockItem(_name, _block);
        return Registry.register(Registry.BLOCK, new Identifier(BetterConcreteMod.MOD_ID, _name), _block);
    }

    private static Item registerBlockItem(String _name, Block _block) {
        return Registry.register(Registry.ITEM, new Identifier(BetterConcreteMod.MOD_ID, _name),
                new BlockItem(_block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + BetterConcreteMod.MOD_ID);
    }
}
