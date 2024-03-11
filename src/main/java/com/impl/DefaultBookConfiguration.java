package com.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DefaultBookConfiguration {

	@Bean
	@Primary
	public Book defaultBook() {
		Book book = new Book();
		book.setTitle("My Sping Book");
		book.setPrice(2000);
		book.setAuthor("Vamsikishore Reddy");
		return book;
	}

	@Bean
	public Book premiumBook() {
		Book book = new Book();
		book.setTitle("Design patterns");
		book.setPrice(3000);
		book.setAuthor("kishore Reddy");
		return book;

	}
}
