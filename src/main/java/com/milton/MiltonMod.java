package com.milton;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.minecraft.server.command.CommandManager.literal;

public class MiltonMod implements ModInitializer {

	public static final String MOD_ID = "milton-client";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("foo")
				.executes(context -> {
					context.getSource().sendMessage(Text.literal("Called /foo with no arguments"));

					return 1;
				})));


		LOGGER.info("Hello Fabric world!");
	}
}
