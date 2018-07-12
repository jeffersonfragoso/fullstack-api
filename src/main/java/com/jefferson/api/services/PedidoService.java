package com.jefferson.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jefferson.api.domain.Pedido;
import com.jefferson.api.repositories.PedidoRepository;
import com.jefferson.api.services.exception.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repo;
	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);  
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+ id + ", Tipo: " +Pedido.class.getName()));
	}
}
