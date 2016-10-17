package org.retana.agendaws.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
public class Contacto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Contacto")
	private Integer idContacto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@ManyToOne
	private Usuario usuario;
	
	public Integer getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Contacto(Integer idContacto, String nombre, String telefono, String direccion, Usuario usuario) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.usuario = usuario;
	}
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
