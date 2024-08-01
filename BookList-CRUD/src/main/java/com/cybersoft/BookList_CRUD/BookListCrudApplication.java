package com.cybersoft.BookList_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "com.cybersoft.BookList_CRUD")
public class BookListCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookListCrudApplication.class, args);
	}
}
