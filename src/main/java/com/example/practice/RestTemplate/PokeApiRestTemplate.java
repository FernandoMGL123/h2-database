package com.example.practice.RestTemplate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.practice.RestTemplate.exception.RestTemplateException;
import com.example.practice.model.Pokemon;
import com.example.practice.model.PokemonResponse;

@Component
public class PokeApiRestTemplate {

	@Autowired
    private RestTemplate restTemplate;
	
	public List<Pokemon> listar() throws RestTemplateException{
		String url = "https://pokeapi.co/api/v2/pokemon/?offset=0&limit=1302";
		ResponseEntity<PokemonResponse> response = restTemplate.getForEntity(url, PokemonResponse.class);
		
		if(response.getStatusCode().equals(HttpStatusCode.valueOf(200))) {
			return response.getBody().getResults();
		}
		 throw new RestTemplateException("error al consumir el servicio");
		
	}
}
