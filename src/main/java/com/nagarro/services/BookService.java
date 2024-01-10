package com.nagarro.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nagarro.model.Book;

public class BookService {

	private final String apiUrl = "http://localhost:8001/Book"; // URL de la API REST

	public void fetchDataFromApi() throws JsonParseException, JsonMappingException, IOException {
		RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            String responseData = response.getBody();
            
            ObjectMapper objectMapper = new ObjectMapper();

            // Convertir JSON a objeto Java
            Book[] book = objectMapper.readValue(responseData, Book[].class);

            System.out.println(book);

            
        } else {
            System.err.println("Error al consumir la API. Código de estado: " + response.getStatusCode());
        }
        
        
	}

}
