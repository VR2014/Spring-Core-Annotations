package com.impl;

import org.springframework.stereotype.Component;

@Component
public class BookRepository {

	public String getBookInfo() {
		return "Book Repository Information";
	}
}
