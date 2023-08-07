package com.sonett.components;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.sonett.controller.Games;

@Component
@Primary
public class Pacman implements Games {
	public Pacman() { System.out.println("Pacman constructor called"); }
	
	public void up() { System.out.println("Pacman up..."); }
	public void down() { System.out.println("Pacman down..."); }
	public void left() { System.out.println("Pacman left..."); }
	public void right() { System.out.println("Pacman right..."); }
}
