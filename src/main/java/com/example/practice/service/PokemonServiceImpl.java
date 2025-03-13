package com.example.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.practice.RestTemplate.PokeApiRestTemplate;
import com.example.practice.RestTemplate.exception.RestTemplateException;
import com.example.practice.model.Pokemon;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PokemonServiceImpl implements PokemonService{
	
	private final PokeApiRestTemplate pokeApi;

	@Override
	public List<Pokemon> listar() throws RestTemplateException {
		// TODO Auto-generated method stub
		return pokeApi.listar();
	}

}
