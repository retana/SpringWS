package org.retana.agendaws.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Integer>{
	List<Usuario> findAll();
}
