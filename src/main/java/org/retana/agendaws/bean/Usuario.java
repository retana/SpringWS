package org.retana.agendaws.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Usuario")
	private Integer idUsuario;
	@Column
	private String nombre;
	@Column
	private String correo;
	@Column
	private String contrasena;
	@Column
	private String token;
	@Column
	private String habilitado;
	@ManyToOne
	private Rol rol;
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String habilitado) {
		this.habilitado = habilitado;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Usuario(Integer idUsuario, String nombre, String correo, String contrasena, String token, String habilitado,
			Rol rol) {
		super();
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasena = contrasena;
		this.token = token;
		this.habilitado = habilitado;
		this.rol = rol;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
}
