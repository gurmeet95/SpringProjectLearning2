package com.newSpringcourse.learnspring.game;

public class GameRunner {
	//MarioGame game;
	// private SuperContraGame game; instead of this lets make it use gamng console for loose coupling
	private GamingConsole game;
	public GameRunner(GamingConsole game) {
		this.game =game;
		
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnintg Game "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

}
