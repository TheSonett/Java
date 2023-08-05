package com.sonett.learn.spring_1.game;

import com.sonett.learn.spring_1.GameManage;

public class MarioGame  implements GameManage
{
	public MarioGame() {}
	
	public void up() { System.out.println("mario going up.."); }
	public void down() { System.out.println("mario went into ground.."); }
	public void left() { System.out.println("mario running forward.."); }
	public void right() { System.out.println("mario looking back"); }
}
