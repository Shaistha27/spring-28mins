package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		try(
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean(Address.class));
		
		System.out.println(context.getBean("person1"));
		System.out.println(context.getBean("person2MethodCall"));
		System.out.println(context.getBean("person3ParameterCall"));
		
		System.out.println(context.getBean("lady"));
		
		}
	}
}
