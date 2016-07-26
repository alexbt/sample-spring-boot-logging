package com.alexbt.logging;

import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringConfigLauncher {
	
	public static void main(String[] args){
		new SpringApplicationBuilder() //
		.sources(Launcher.class)//
		.profiles("spring")//
		.run(args);
	}
}
