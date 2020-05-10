package com.projectreddog.modularmachinemod.init;

import com.projectreddog.modularmachinemod.entities.ModularMachineEntity;
import com.projectreddog.modularmachinemod.reference.Reference;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ObjectHolder;

public class ModEntities {

	@ObjectHolder(Reference.MODID + ":" + Reference.REIGSTRY_NAME_MODULAR_MACHINE_ENTITY)
	public static EntityType<ModularMachineEntity> MODULARMACHINE;

	public static void RegisterEntites(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().register(EntityType.Builder.create(ModularMachineEntity::new, EntityClassification.MONSTER).size(0.751F, 1.95F).setShouldReceiveVelocityUpdates(false).build(Reference.REIGSTRY_NAME_MODULAR_MACHINE_ENTITY).setRegistryName(Reference.MODID, Reference.REIGSTRY_NAME_MODULAR_MACHINE_ENTITY));

	}

}
