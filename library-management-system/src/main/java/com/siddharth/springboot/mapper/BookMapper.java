package com.siddharth.springboot.mapper;

import com.siddharth.springboot.dto.BookDto;
import com.siddharth.springboot.entities.Book;

public class BookMapper {

    public static BookDto mapToBookDto(Book book){
        BookDto bookDto = new BookDto();
        bookDto.setId(book.getId());
        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setBorrowed(book.isBorrowed());
        bookDto.setBorrowedBy(book.getBorrowedBy());
        return bookDto;
    }

    public static Book mapToBook(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setBorrowed(bookDto.isBorrowed());
        book.setBorrowedBy(bookDto.getBorrowedBy());
        return book;
    }
}
