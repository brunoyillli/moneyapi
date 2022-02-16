package com.projetos.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
