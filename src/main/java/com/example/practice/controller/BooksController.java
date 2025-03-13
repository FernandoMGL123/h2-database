package com.example.practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.model.Books;
import com.example.practice.service.BooksService;
import com.example.practice.service.exception.BooksException;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BooksController {
	
	private final BooksService booksService;
	
	@GetMapping
    public List<Books> getAllProducts() {
        return booksService.lista();
    }

    @GetMapping("/{id}")
    public Books getProductById(@PathVariable Long id) {
        return booksService.ObtenerLibro(id);
    }

    @PostMapping
    public Books createProduct(@RequestBody Books book) {
        return booksService.insertar(book);
    }

    @PutMapping("/{id}")
    public Books updateProduct(@PathVariable Long id, @RequestBody Books book) throws BooksException {
        return booksService.actualizar(id, book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
    	booksService.eliminar(id);
    }

}
