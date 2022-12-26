package com.newSpringcourse.learnspring.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
//YourBUsinessClass
//Dependecny1
//Dependency2


@Component
class YourBusinessClass{
	//@Autowired   //Field INjection
	Dependency1 dependency1;
	Dependency2 dependency2;
@Autowired // if we have constructer and don have autowired on it spring still used constructer as dependecny injection
public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	System.out.println("Constructer INjection-YOur BUsines Class");
		
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
//	@Autowired   //Setter based dependecies
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection-SetDependency1");
//		this.dependency1 = dependency1;
//	}
//	
//	
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection-SetDependency2");
//		this.dependency2 = dependency2;
//	}
	public String toString() {
		return "Using "+ dependency1 +" and "+ dependency2;
	}
	
}
@Component
class Dependency1{
	
}
@Component
class Dependency2{
	
}

@Configuration
@ComponentScan //This perform scan in same package only it is present.
public class DepInjectionAppLauncherApplication2{
	

	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(DepInjectionAppLauncherApplication2.class)){
			
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBusinessClass.class));
			
		};
		
	

}
}
