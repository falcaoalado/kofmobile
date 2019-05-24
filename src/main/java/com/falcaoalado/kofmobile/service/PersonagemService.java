package com.falcaoalado.kofmobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falcaoalado.kofmobile.model.Personagem;
import com.falcaoalado.kofmobile.repository.PersonagemRepository;

@Service
public class PersonagemService {

	@Autowired
	private PersonagemRepository repository;
	
	public Personagem criar(Personagem personagem) {
		Personagem salvo = repository.save(personagem);
		
		return salvo;
	}
	
	public List<Personagem> listar() {
		return repository.findAll();
	}
}
