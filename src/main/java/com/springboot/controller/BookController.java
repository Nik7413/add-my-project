package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.domain.Book;
import com.springboot.dao.BookDAO;

import java.util.Map;

//Fill your code here
@RestController
public class BookController {

	//Fill your code here
	@Autowired
	private BookDAO bdao;
	
	@PostMapping("/book/create")
    public Book create(@RequestBody Book book)
    {
	//Fill your code here
		return bdao.saveBook(book);
    }

	//Fill your code here
	@GetMapping("/book/categorize")
    public Map<String, List<Book>> categorizeBooks()
    {
        //Fill your code here
		return bdao.categorizeBooks();
    }
}
