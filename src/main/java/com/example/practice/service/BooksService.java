package com.example.practice.service;

import java.util.List;

import com.example.practice.model.Books;
import com.example.practice.service.exception.BooksException;

public interface BooksService {
	
	Books insertar(Books products);
	
	Books actualizar(Long id, Books products) throws BooksException;
	
	void eliminar(Long id);
	
	List<Books> lista();
	
	Books ObtenerLibro(Long id);


}
