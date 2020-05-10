package com.projectreddog.modularmachinemod.entities;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;
import net.minecraft.world.World;

public class ModularMachineEntity extends LivingEntity {

	public ModularMachineEntity(EntityType<? extends LivingEntity> type, World p_i48577_2_) {
		super(type, p_i48577_2_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Iterable<ItemStack> getArmorInventoryList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack getItemStackFromSlot(EquipmentSlotType slotIn) {
		// TODO Auto-generated method stub
		return ItemStack.EMPTY;
	}

	@Override
	public void setItemStackToSlot(EquipmentSlotType slotIn, ItemStack stack) {
		// TODO Auto-generated method stub

	}

	@Override
	public HandSide getPrimaryHand() {
		// TODO Auto-generated method stub
		return null;
	}

}
