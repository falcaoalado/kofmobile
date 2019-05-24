package com.falcaoalado.kofmobile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.falcaoalado.kofmobile.model.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> { }
