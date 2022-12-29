package com.newSpringcourse.learnspring.examples.PostConstructPredestroy;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
class SomeClass{
	private SomeDependency someDependency;
	@Autowired
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency=someDependency;
		System.out.println("all dependecies are ready");
	}
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleanup");
	}
}

@Component
class SomeDependency{
	public void getReady() {
		System.out.println("Some loigc using some dpendency");
	}
	
}
@Configuration
@ComponentScan //This perform scan in same package only it is present.
public class PrePostAnnotationContextLauncher{
	

	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncher.class)){
			
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		};
		
	

}
}
