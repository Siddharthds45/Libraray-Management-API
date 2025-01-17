package com.siddharth.springboot.services;

import com.siddharth.springboot.dto.BookDto;

import java.util.List;

public interface BookService {

    BookDto createBook(BookDto bookDto);
    List<BookDto> getBooks();
    BookDto getBookById(Long bookId);
    BookDto updateBook(Long book_id, BookDto book);
    void deleteBook(Long book_id);
    BookDto borrowBook(Long book_id, Long user_id);
    BookDto returnBook(Long book_id);

}
