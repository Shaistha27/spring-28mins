package com.in28minutes.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age) { };
record Lady (String name, int age, Address address) { };
record Address (String firstLane, String city) { };
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Shaistha Tabassum";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person1() {
		return new Person("Alex", 20);
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age());
	}
	
	@Bean
	public Person person3ParameterCall(String name, int age) {
		return new Person(name, age);
	}
	
	@Bean
	@Primary
	public Address address() {
		return new Address("TN","Hyd");
	}
	@Bean
	@Qualifier("address2Qualifier")
	public Address address2() {
		return new Address("YLG","Banglore");
	}

	@Bean
	public Lady lady(String name, int age, @Qualifier("address2Qualifier") Address address2) {
		return new Lady (name, age, address2);
	}
}
