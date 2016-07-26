package com.alexbt.logging;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class MinimalConfigLauncher {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(Launcher.class)//
		.profiles("minimal")//
		.run(args);
	}
}
