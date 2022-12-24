package com.newSpringcourse.learnspring;

import com.newSpringcourse.learnspring.game.GameRunner;
import com.newSpringcourse.learnspring.game.GamingConsole;
import com.newSpringcourse.learnspring.game.MarioGame;
import com.newSpringcourse.learnspring.game.PacMan;
import com.newSpringcourse.learnspring.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game=new PacMan();
		return game;
	}
	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		var gameRunner=new GameRunner(game);
		return gameRunner;
	}

}
public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			//this try is called tryused block
			context.getBean(GameRunner.class).run();
		};
		
	

}
}
