package com.projectreddog.modularmachinemod.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ItemsItemGroup extends ItemGroup {

	public ItemsItemGroup() {
		super("weapons");

	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(Items.STICK);
	}

}
