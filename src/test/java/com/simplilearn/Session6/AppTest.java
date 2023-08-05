package com.simplilearn.Session6;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import com.simplilearn.Session6.model.Book;
import com.simplilearn.Session6.model.BookService;

public class AppTest 
{
	@Test
	public void assertTrueWithNoMessage() {
		BookService service = new BookService();
		List<Book> books = service.getBooks();
		
		assertTrue(books.isEmpty());
	}

	
}