package com.projectreddog.modularmachinemod.proxy;

import com.projectreddog.modularmachinemod.client.renderer.ModularMachineRenderer;
import com.projectreddog.modularmachinemod.init.ModEntities;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy {

	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}

	@Override
	public void init() {
		// Entity Renderers
		RenderingRegistry.registerEntityRenderingHandler(ModEntities.MODULARMACHINE, ModularMachineRenderer::new);

		// Client Gui
		// ScreenManager.registerFactory(ModContainers.BASIC_CONTAINER, BasicScreen::new);

		// MinecraftForge.EVENT_BUS.register(new RenderOverlay());
		KeyBindings();
	}

	public void KeyBindings() {
		// ClientRegistry.registerKeyBinding(ClientEvents.controlGroup1);

	}

	@Override
	public boolean isServer() {
		return false;
	}

}
