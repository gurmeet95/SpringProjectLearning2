package com.newSpringcourse.learnspring.game;

public class MarioGame implements GamingConsole{
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Inside hole");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("Go forward");
	}

}
