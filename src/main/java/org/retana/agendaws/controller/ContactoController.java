package org.retana.agendaws.controller;

import java.util.List;

import org.retana.agendaws.bean.Contacto;
import org.retana.agendaws.bean.ContactoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactoController {
	@RequestMapping("/contactos")
	@ResponseBody
	public List<Contacto> getAll(){
		return contactoDao.findAll(); 
	}
	@RequestMapping("/user/login")
	@ResponseBody
	public String doLogin(){
		return "Hello From login"; 
	}
	@Autowired
	private ContactoDao contactoDao;
}
