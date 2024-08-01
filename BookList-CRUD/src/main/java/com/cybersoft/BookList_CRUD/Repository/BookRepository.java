package com.cybersoft.BookList_CRUD.Repository;


import com.cybersoft.BookList_CRUD.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
