package com.leandro.cursomc.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leandro.cursomc.Services.exceptions.ObjectNotFoundException;
import com.leandro.cursomc.domain.Pedido;
import com.leandro.cursomc.repositories.PedidoRepository;



@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id:" + id + ", Tipo; " + Pedido.class.getName())
				);
	}
}
