package com.newSpringcourse.learnspring.game;

import org.springframework.stereotype.Component;

@Component   //Now instance of this Pacman class will be create by Spring for us.
public class PacMan implements GamingConsole{

	@Override
	public void up() {
		
		System.out.println("Tha Tha");
		
	}

	@Override
	public void down() {
		System.out.println("ha ha");
		
	}

	@Override
	public void left() {
		System.out.println("La La");
		
	}

	@Override
	public void right() {
		System.out.println("Ja Ja");
		
	}

}
