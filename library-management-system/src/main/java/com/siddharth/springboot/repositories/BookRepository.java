package com.siddharth.springboot.repositories;

import com.siddharth.springboot.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
