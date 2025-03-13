package com.example.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practice.model.Books;
import com.example.practice.repository.BooksRepository;
import com.example.practice.service.exception.BooksException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class BooksServiceImpl implements BooksService{
	
	private final BooksRepository booksRepository;

	@Override
	public Books insertar(Books products) {
		return booksRepository.save(products);
	}

	@Override
	public Books actualizar(Long id, Books books) throws BooksException {
		Books book = booksRepository.findById(id).orElseThrow(() -> new BooksException("libro no encontrado"));

		book.setAuthor(books.getAuthor());
		book.setName(books.getName());
		book.setPrecio(books.getPrecio());
		return booksRepository.save(book);
	}

	@Override
	public void eliminar(Long id) {
		Books book = booksRepository.findById(id).orElseThrow(() -> new BooksException("libro no encontrado"));
		booksRepository.deleteById(id);
	}

	@Override
	public List<Books> lista() {
		return booksRepository.findAll();
	}

	@Override
	public Books ObtenerLibro(Long id) {
		Books book = booksRepository.findById(id).orElseThrow(() -> new BooksException("libro no encontrado"));
		return book;
	}

}
