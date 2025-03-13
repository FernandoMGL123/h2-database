package com.example.practice.service;

import java.util.List;

import com.example.practice.RestTemplate.exception.RestTemplateException;
import com.example.practice.model.Pokemon;

public interface PokemonService {
	
	List<Pokemon> listar() throws RestTemplateException;

}
