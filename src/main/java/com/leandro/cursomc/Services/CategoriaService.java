package com.leandro.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.cursomc.domain.Categoria;
import com.leandro.cursomc.repositories.CateoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CateoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
