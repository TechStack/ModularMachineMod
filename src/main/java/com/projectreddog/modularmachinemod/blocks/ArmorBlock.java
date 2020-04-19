package com.projectreddog.modularmachinemod.blocks;

import com.projectreddog.modularmachinemod.reference.Reference;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ArmorBlock extends MachineModuleBlock {

	public ArmorBlock() {
		super(Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(2.0f));
		setRegistryName(Reference.REIGSTRY_NAME_ARMOR_BLOCK);

	}

}
