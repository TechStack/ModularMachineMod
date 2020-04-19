package com.projectreddog.modularmachinemod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public class ClientProxy implements IProxy {

	@Override
	public World getClientWorld() {
		return Minecraft.getInstance().world;
	}

	@Override
	public void init() {
		// Entity Renderers
		// RenderingRegistry.registerEntityRenderingHandler(MinionEntity.class, MinionRenderer::new);

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
