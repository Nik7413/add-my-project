package com.springboot.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.remote.html5.AddApplicationCache;
import org.springframework.stereotype.Component;

import com.springboot.domain.Book;

//Fill your code here
@Component
public class BookDAO {
	
	public static List<Book> bookList = new ArrayList<Book>();
	static {
		bookList.add(new Book(1L, "The Silent Patient","Psychological thriller","Celadon Books", "Alex Michaelides"));
		bookList.add(new Book(2L, "The Plot","Domestic Fiction","Celadon Books", "Jean Hanff Korelitz"));
		bookList.add(new Book(3L, "In Cold Blood","Non-fiction","Random House", "Truman Capote"));
		bookList.add(new Book(4L, "The Road to Reality","LAWS OF THE UNIVERSE","Random House", "ROGER PENROSE"));
		bookList.add(new Book(5L, "Big Little Lies","Non-fiction","Penguin Publishing","Liane Moriarty"));
	}

	public Map<String, List<Book>> categorizeBooks() {
		//Fill your code here
		Map<String,List<Book>> bmap = new HashMap<>();
		ArrayList<Book> cbooks = new ArrayList<>();
		ArrayList<Book> random = new ArrayList<>();
		ArrayList<Book> pengiun = new ArrayList<>();
		for(Book b : bookList) {
			if(bmap.containsKey(b.getPublisher())) {
				bmap.get(b.getPublisher()).add(b);
			}else {
				bmap.put(b.getPublisher(), new ArrayList<Book>(){
					{
						add(b);
					}
				});
			}
		}
		return bmap;
	}
	
	public Book saveBook(Book book) {
		//Fill your code here
		bookList.add(book);
		return book;
	}
}
