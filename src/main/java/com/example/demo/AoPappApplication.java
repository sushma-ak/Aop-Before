package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AoPappApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(AoPappApplication.class, args);
		Demo demo=context.getBean(Demo.class);
		

		demo.demo();
		System.out.println("I am calling again");
		

		demo.demo();
		context.close();
	}

}
