package org.retana.agendaws.bean;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

@Transactional
public interface ContactoDao extends CrudRepository<Contacto, Integer> {
	public List<Contacto> findAll();
}
