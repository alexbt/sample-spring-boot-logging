package com.alexbt.logging;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class LogbackConfigLauncher {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(Launcher.class)//
		.profiles("logback")//
		.run(args);
	}
}
