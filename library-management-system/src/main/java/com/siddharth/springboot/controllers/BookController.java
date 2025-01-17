package com.siddharth.springboot.controllers;

import com.siddharth.springboot.dto.BookDto;
import com.siddharth.springboot.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // Build Add New Book REST API
    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){
        BookDto savedBook = bookService.createBook(bookDto);
        return new ResponseEntity<>(savedBook, HttpStatus.CREATED);
    }

    // Build Get All Books REST API
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        List<BookDto> books = bookService.getBooks();
        return ResponseEntity.ok(books);
    }

    //Build Get Specific Book REST API
    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable("id") Long bookId){
        BookDto book = bookService.getBookById(bookId);
        return ResponseEntity.ok(book);
    }

    //Build Update the Book REST API
    @PutMapping("/{id}")
    public ResponseEntity<BookDto> updateBook(@PathVariable("id") Long book_id, @RequestBody BookDto book){
        BookDto updatedBook = bookService.updateBook(book_id, book);
        return ResponseEntity.ok(updatedBook);
    }

    // Build Delete Book REST API
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long book_id){
        bookService.deleteBook(book_id);
        return ResponseEntity.ok("Book is successfully deleted");
    }

    // Build Borrow Book REST API
    @PostMapping("/{book_id}/borrow/{user_id}")
    public ResponseEntity<BookDto> borrowBook(@PathVariable("book_id") Long book_id, @PathVariable("user_id") Long user_id){
        BookDto borrowedBook =  bookService.borrowBook(book_id, user_id);
        if(borrowedBook != null){
            return ResponseEntity.ok(borrowedBook);
        }else{
            return ResponseEntity.badRequest().build();
        }
    }

    // Build Return Book REST API
    @PostMapping("/{book_id}/return")
    public ResponseEntity<BookDto> returnBook(@PathVariable("book_id") Long book_id){
        BookDto returnedBook = bookService.returnBook(book_id);
        if(returnedBook != null){
            return ResponseEntity.ok(returnedBook);
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
}
