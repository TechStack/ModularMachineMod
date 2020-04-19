package com.projectreddog.modularmachinemod.proxy;

import net.minecraft.world.World;

public interface IProxy {

	void init();

	World getClientWorld();

	boolean isServer();
}
