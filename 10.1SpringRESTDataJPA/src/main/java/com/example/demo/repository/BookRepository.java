package com.example.demo.repository;

import com.example.demo.model.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    Iterable<Book> findAllByTitle(String title);

    public List<Book> findAll();

    public Book findBookById(Long id);

}
