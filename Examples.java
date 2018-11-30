package com.example.examples;

import me.prouser123.kodicore.Discord;

public class Examples {
	
	public static void discord {
		// Create an instance of the Discord class
		new Discord("bot-token");
		
		// Register a command '!ping' with output 'pong' (Runs on Discord, not Minecraft).
		Discord.createListener.discordCommand("!ping", "pong", Discord.api);
		
		// Register a command to, when run by the bot owner, grab the owner's avatar and set as the bot avatar.
		Discord.api.addMessageCreateListener(new CopyOwnerAvatar("!getOwnerAvatar"));
	}
}