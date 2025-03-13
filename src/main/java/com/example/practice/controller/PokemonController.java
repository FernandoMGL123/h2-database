package com.example.practice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.RestTemplate.exception.RestTemplateException;
import com.example.practice.model.Pokemon;
import com.example.practice.service.PokemonService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pokemon")
@RequiredArgsConstructor
public class PokemonController {
	
	private final PokemonService pokemonService;

	
	@GetMapping
    public List<Pokemon> getAllProducts() throws RestTemplateException {
        return pokemonService.listar();
    }
}
