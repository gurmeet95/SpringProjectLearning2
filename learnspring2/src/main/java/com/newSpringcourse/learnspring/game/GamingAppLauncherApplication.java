package com.newSpringcourse.learnspring.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.newSpringcourse.learnspring.game;")// Tell Spring where to search for Component.
public class GamingAppLauncherApplication{
	

	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)){
			context.getBean(GamingConsole.class).up();
			//this try is called try used block
			context.getBean(GameRunner.class).run();
		};
		
	

}
}
