package com.sonett.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sonett.components.Mario;
import com.sonett.components.Pacman;
import com.sonett.controller.GameRunner;
import com.sonett.controller.Games;

@Configuration
@ComponentScan({"com.sonett.components", "com.sonett.controller"})
public class GameConfig {
	
//	@Bean
//	public Games game() {
//		return new Mario();
//	}
	
//	@Bean
//	public GameRunner gameRunner(Games game) {
//		GameRunner runner = new GameRunner(game);
//		return runner;
//	}
}
