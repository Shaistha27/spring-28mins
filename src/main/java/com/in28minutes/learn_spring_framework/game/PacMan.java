package com.in28minutes.learn_spring_framework.game;

public class PacMan implements GamingConsole{

	public void up() {
		System.out.println("eat from up direction");
	}
	
	public void down() {
		System.out.println("eat from down direction");
	}
	
	public void left() {
		System.out.println("eat from left direction");
	}
	
	public void right() {
		System.out.println("eat in right direction");
	}
}
