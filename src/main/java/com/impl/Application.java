package com.impl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class Application {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		BookServiceImpl bookService = context.getBean(BookServiceImpl.class);
		bookService.setBook("Book");
		

		System.out.println("Book Service Info: " + bookService.getServiceInfo());

		context.close();
	}
}
