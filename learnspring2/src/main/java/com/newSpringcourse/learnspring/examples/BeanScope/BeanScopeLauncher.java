package com.newSpringcourse.learnspring.examples.BeanScope;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClaSS{
	
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}
@Configuration
@ComponentScan //This perform scan in same package only it is present.
public class BeanScopeLauncher{
	

	

	public static void main(String[] args) {
		try(var context=new AnnotationConfigApplicationContext(BeanScopeLauncher.class)){
			System.out.println(context.getBean(NormalClaSS.class));
			System.out.println(context.getBean(NormalClaSS.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
		};
		
	

}
}
