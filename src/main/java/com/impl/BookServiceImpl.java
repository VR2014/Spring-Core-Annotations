package com.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl {
	private double premiumdiscount;

	@Autowired
	public void setPremiumDiscount(@Value("${premium.discount}") double premiumdiscount) {

		this.premiumdiscount = premiumdiscount;
	}

	@Autowired
	@Qualifier("defaultBook")
	private Book defaultBook;
	@Autowired
	Book book;

	@Autowired
	private BookRepository bookRepository;

	public String getServiceInfo() {
		return bookRepository.getBookInfo();
	}

	public void setBook(String name) {

		book.setTitle(name);
	}

	public double calculateDiscountinfo(Book book, boolean isPremiumMember) {

		double price = book.getPrice();
		if (isPremiumMember) {
			return price * (1 - premiumdiscount);
		} else {
			return premiumdiscount;
		}

	}

}
