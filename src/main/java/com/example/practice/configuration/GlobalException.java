package com.example.practice.configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.practice.service.exception.BooksException;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(BooksException.class)
    public ResponseEntity<String> handleResourceNotFoundException(BooksException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ex.getMessage());
    }
}
