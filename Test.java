package com.example.test;

import me.prouser123.kodicore.Discord;

public class Test {
	
	public static void main(String[] args) {
		new Discord("bot-token");
		Discord.createListener.discordCommand("!ping", "pong", Discord.api);
		
		Discord.api.addMessageCreateListener(new CopyOwnerAvatar());
	}
}