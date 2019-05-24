package com.falcaoalado.kofmobile.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falcaoalado.kofmobile.model.Personagem;
import com.falcaoalado.kofmobile.service.PersonagemService;

@RestController
@RequestMapping("/personagens")
public class PersonagemResource {

	@Autowired
	private PersonagemService service;
	
	@PostMapping
	public ResponseEntity<Personagem> criar(@RequestBody Personagem personagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(personagem));
	}
	
	@GetMapping
	public ResponseEntity<List<Personagem>> listar() {
		return ResponseEntity.ok(service.listar());
	}
}
