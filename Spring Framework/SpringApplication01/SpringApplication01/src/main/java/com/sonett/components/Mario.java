package com.sonett.components;

import org.springframework.stereotype.Component;

import com.sonett.controller.Games;

@Component
public class Mario implements Games {
	public Mario() { System.out.println("Mario constructor called"); }
	
	public void up() { System.out.println("Mario up..."); }
	public void down() { System.out.println("Mario down..."); }
	public void left() { System.out.println("Mario left..."); }
	public void right() { System.out.println("Mario right..."); }
}
