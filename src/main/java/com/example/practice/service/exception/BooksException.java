package com.example.practice.service.exception;

import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BooksException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BooksException(String mensaje) {
        super(mensaje);
        log.error(mensaje);
    }

}
