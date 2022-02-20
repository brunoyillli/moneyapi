package com.projetos.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.moneyapi.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
