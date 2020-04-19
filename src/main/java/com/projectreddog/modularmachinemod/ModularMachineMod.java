package com.projectreddog.modularmachinemod;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.projectreddog.modularmachinemod.init.ModBlocks;
import com.projectreddog.modularmachinemod.proxy.ClientProxy;
import com.projectreddog.modularmachinemod.proxy.IProxy;
import com.projectreddog.modularmachinemod.proxy.ServerProxy;
import com.projectreddog.modularmachinemod.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Reference.MODID)
public class ModularMachineMod {
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	public static final Logger LOGGER = LogManager.getLogger();

	private void setup(final FMLCommonSetupEvent event) {
		proxy.init();
		// ModNetwork.init();
	}

	// You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
	// Event bus for receiving Registry Events)
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
			// register a new block here
			LOGGER.info("HELLO from Register Block");
			ModBlocks.RegisterBlocks(event);
		}

		@SubscribeEvent
		public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
			// register a new block here
			LOGGER.info("HELLO from Register ITEM");
			ModBlocks.RegisterBlockItems(event);
			// ModItems.RegisterItems(event);

		}
	}
}
