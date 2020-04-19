package com.projectreddog.modularmachinemod.init;

import com.projectreddog.modularmachinemod.items.WrenchItem;
import com.projectreddog.modularmachinemod.reference.Reference;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModItems {

	@ObjectHolder(Reference.MODID + ":" + Reference.REGISTRY_NAME_WRENCH_ITEM)
	public static WrenchItem WRENCH = new WrenchItem();

	public static void RegisterItems(final RegistryEvent.Register<Item> event) {
		RegisterItem(event, ModItems.WRENCH);

	}

	// Called to register every item.
	private static void RegisterItem(final RegistryEvent.Register<Item> event, Item item) {
		event.getRegistry().register(item);

	}
}
