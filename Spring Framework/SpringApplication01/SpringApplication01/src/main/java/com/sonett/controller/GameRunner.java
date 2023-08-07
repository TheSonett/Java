package com.sonett.controller;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private Games game;
	
	public GameRunner(Games game) {
		this.game = game;
	}
	
	public void play() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
