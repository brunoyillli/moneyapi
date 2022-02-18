package com.projetos.moneyapi.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetos.moneyapi.model.Categoria;
import com.projetos.moneyapi.repository.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria atualizar(Long codigo, @Valid Categoria categoria) {
		Optional<Categoria> categoriaSalva = categoriaRepository.findById(codigo);
		if (categoriaSalva.isEmpty()) {
			throw new EmptyResultDataAccessException(1);
		}
		BeanUtils.copyProperties(categoria, categoriaSalva.get(), "codigo");
		return categoriaRepository.save(categoriaSalva.get());
	}
	
	
}
