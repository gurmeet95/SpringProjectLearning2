package com.newSpringcourse.learnspring.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
	
	
}
@Component
@Lazy
class ClassB{
	private ClassA classA;
	public ClassB(ClassA classA) {
		System.out.println("Some Initializatio Logic");
		this.classA=classA;
	}
	public void dosomething() {
		System.out.println("Do Something");
	}
	
}

@Configuration
@ComponentScan
public class LazyINitalizationLauncher{
	

	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(LazyINitalizationLauncher.class)){
			
			System.out.println("Intialization of  context is completed.");
			context.getBean(ClassB.class).dosomething();
		
		
	

}
	}
}
