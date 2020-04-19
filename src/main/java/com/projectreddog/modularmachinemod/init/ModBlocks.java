package com.projectreddog.modularmachinemod.init;

import java.util.function.Supplier;

import com.projectreddog.modularmachinemod.blocks.ArmorBlock;
import com.projectreddog.modularmachinemod.blocks.DrillBlock;
import com.projectreddog.modularmachinemod.reference.Reference;
import com.projectreddog.modularmachinemod.tilteentity.ArmorTileEntity;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

	// BLOCKS
	@ObjectHolder(Reference.MODID + ":" + Reference.REIGSTRY_NAME_ARMOR_BLOCK)
	public static ArmorBlock ARMOR_BLOCK = new ArmorBlock();

	@ObjectHolder(Reference.MODID + ":" + Reference.REIGSTRY_NAME_DRILL_BLOCK)
	public static DrillBlock DRILL_BLOCK = new DrillBlock();

	// TILE ENTITIES
	@ObjectHolder(Reference.MODID + ":" + Reference.REIGSTRY_NAME_ARMOR_BLOCK)
	public static TileEntityType<ArmorTileEntity> ARMOR_TILE_ENTITY_TYPE;

	public static void RegisterBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(ModBlocks.ARMOR_BLOCK);
		event.getRegistry().register(ModBlocks.DRILL_BLOCK);

	}

	public static void RegisterBlockItems(final RegistryEvent.Register<Item> event) {
		RegisterBlockItem(event, ModBlocks.ARMOR_BLOCK);
		RegisterBlockItem(event, ModBlocks.DRILL_BLOCK);

	}

	// Use default BlockItem group
	private static void RegisterBlockItem(final RegistryEvent.Register<Item> event, Block block) {
		RegisterBlockItem(event, block, ModItemGroups.blocksItemGroup);
	}

	// For use when need to specify item group
	private static void RegisterBlockItem(final RegistryEvent.Register<Item> event, Block block, ItemGroup group) {
		event.getRegistry().register(new BlockItem(block, new Item.Properties().group(group)).setRegistryName(block.getRegistryName()));
	}

	public static void RegisterTileEntities(final RegistryEvent.Register<TileEntityType<?>> event) {
		RegisterTileEntity(event, ArmorTileEntity::new, ModBlocks.ARMOR_BLOCK);

	}

	private static <T extends TileEntity> void RegisterTileEntity(final RegistryEvent.Register<TileEntityType<?>> event, Supplier<? extends T> factoryIn, Block block) {
		event.getRegistry().register(TileEntityType.Builder.create(factoryIn, block).build(null).setRegistryName(block.getRegistryName()));
	}
}
