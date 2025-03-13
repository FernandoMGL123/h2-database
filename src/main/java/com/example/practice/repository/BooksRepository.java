package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{

}
