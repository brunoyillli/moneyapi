package com.projetos.moneyapi.repository.lancamento;

import java.util.List;

import com.projetos.moneyapi.model.Lancamento;
import com.projetos.moneyapi.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
	
}
