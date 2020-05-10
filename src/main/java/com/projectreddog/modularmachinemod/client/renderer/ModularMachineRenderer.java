package com.projectreddog.modularmachinemod.client.renderer;

import com.projectreddog.modularmachinemod.entities.ModularMachineEntity;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class ModularMachineRenderer extends EntityRenderer<ModularMachineEntity> {

	public ModularMachineRenderer(EntityRendererManager renderManager) {
		super(renderManager);
		// TODO Auto-generated constructor stub
	}

//	public static final IRenderFactory<ModularMachineEntity> FACTORY = ModularMachineRenderer::new;

//	public ModularMachineRenderer(EntityRendererManager manager) {
//		// super(manager, new ModularMachineModel(), .5f);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public ResourceLocation getEntityTexture(ModularMachineEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
