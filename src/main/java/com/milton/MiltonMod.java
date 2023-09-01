package com.milton;

import net.fabricmc.api.ModInitializer;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiltonMod implements ModInitializer {

	public static final String MOD_ID = "milton-client";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
	private void onClientTick(MinecraftClient client) {
		MatrixStack matrixStack = new MatrixStack();
	}
}
