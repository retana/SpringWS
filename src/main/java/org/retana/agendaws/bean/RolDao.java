package org.retana.agendaws.bean;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RolDao extends CrudRepository<Rol, Integer>{
	List<Rol> findAll();
}
