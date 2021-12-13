package net.akkiirah.betterconcrete.blocks;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.akkiirah.betterconcrete.BetterConcreteMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ModBlocks {

        @Deprecated
        public static final Block WHITE_CONCRETE_WALLS = registerBlock("white_concrete_wall",
                        new WallBlock(FabricBlockSettings.of(Material.STONE).hardness(1.8f)
                                        .breakByTool(FabricToolTags.PICKAXES, 0)
                                        .requiresTool()),
                        ItemGroup.DECORATIONS);

        @Deprecated
        public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
                        new ModStairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                                        FabricBlockSettings.of(Material.STONE).hardness(1.8f)
                                                        .breakByTool(FabricToolTags.PICKAXES, 0)
                                                        .requiresTool()),
                        ItemGroup.BUILDING_BLOCKS);

        @Deprecated
        public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
                        new SlabBlock(FabricBlockSettings.of(Material.STONE).hardness(1.8f)
                                        .breakByTool(FabricToolTags.PICKAXES, 0)
                                        .requiresTool()),
                        ItemGroup.BUILDING_BLOCKS);

        private static Block registerBlock(String _name, Block _block, ItemGroup _itemGroup) {
                registerBlockItem(_name, _block, _itemGroup);
                return Registry.register(Registry.BLOCK, new Identifier(BetterConcreteMod.MOD_ID, _name), _block);
        }

        private static Item registerBlockItem(String _name, Block _block, ItemGroup _itemGroup) {
                return Registry.register(Registry.ITEM, new Identifier(BetterConcreteMod.MOD_ID, _name),
                                new BlockItem(_block, new FabricItemSettings().group(_itemGroup)));
        }

        public static void registerModBlocks() {
                System.out.println("Registering ModBlocks for " + BetterConcreteMod.MOD_ID);
        }
}
