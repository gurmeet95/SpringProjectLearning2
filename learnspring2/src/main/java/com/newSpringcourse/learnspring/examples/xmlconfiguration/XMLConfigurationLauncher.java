package com.newSpringcourse.learnspring.examples.xmlconfiguration;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.newSpringcourse.learnspring.game.GameRunner;


public class XMLConfigurationLauncher{
	

	

	public static void main(String[] args) {
		try(var context=new ClassPathXmlApplicationContext("contextconfiguration.xml")){
			
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			context.getBean(GameRunner.class).run();
		};
		
	

}
}
