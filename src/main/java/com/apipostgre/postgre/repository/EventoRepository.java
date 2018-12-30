package com.apipostgre.postgre.repository;//Para utilizar metodos deletar, incluir, etc...

import org.springframework.data.repository.CrudRepository;

import com.apipostgre.postgre.model.Evento;

public interface EventoRepository extends CrudRepository <Evento, String>{
	Evento findByCodigo(long codigo);
}
