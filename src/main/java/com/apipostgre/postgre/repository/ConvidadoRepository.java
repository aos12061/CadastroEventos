package com.apipostgre.postgre.repository;

import org.springframework.data.repository.CrudRepository;

import com.apipostgre.postgre.model.Convidado;
import com.apipostgre.postgre.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{//Para utilizar metodos deletar, incluir, etc...
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String Rg);
}
