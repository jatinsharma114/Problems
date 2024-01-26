package com.example.autowire;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AutowireApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AutowireApplication.class, args);

	}

}
