package com.newSpringcourse.learnspring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	private GamingConsole game;
	public GameRunner(@Qualifier("superContraGame")GamingConsole game) {
		// or @Qualifier("SuperContraGameQualifier") both work
		// Bean name with small letter.
		this.game =game;
		
	}
	public void run() {
		
		System.out.println("Runnintg Game "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
