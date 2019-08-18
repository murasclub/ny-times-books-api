package com.nursultanturdaliev.nytimes.repository;

import com.nursultanturdaliev.nytimes.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}
