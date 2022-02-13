package com.projetos.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
