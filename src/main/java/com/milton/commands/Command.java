package com.milton.commands;


import com.milton.utils.Utils;
import net.minecraft.command.CommandRegistryAccess;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.server.command.CommandManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Command {
	protected static final CommandRegistryAccess REGISTRY_ACCESS = CommandManager
			.createRegistryAccess(BuiltinRegistries.createWrapperLookup());

	private final String name;
	private final String title;
	private final String description;
	private final List<String> aliases = new ArrayList<>();

	protected Command(String name, String description, String... aliases) {
		this.name = name;
		this.title = Utils.nameToTitle(name);
		this.description = description;
		Collections.addAll(this.aliases, aliases);
	}
}
