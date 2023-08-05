package com.sonett.learn.spring_1;

public class GameRunner {
	private GameManage game = null;
	
	public GameRunner(GameManage game) {
		this.game = game;
	}
	
	public void play() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
