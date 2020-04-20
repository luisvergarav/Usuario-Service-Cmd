package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;
import java.util.List;


import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;

class UsuarioRootEntity {
	private int idUsuario;

	private int activo;

	private String nick;

	private String nombre;

	private String password;

	private List<UsuarioRole> usuarioRoles;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<UsuarioRole> getUsuarioRoles() {
		return usuarioRoles;
	}

	public void setUsuarioRoles(List<UsuarioRole> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	public UsuarioRootEntity(int idUsuario, int activo, String nick, String nombre, String password,
			List<UsuarioRole> usuarioRoles2) {
		super();
		this.idUsuario = idUsuario;
		this.activo = activo;
		this.nick = nick;
		this.nombre = nombre;
		this.password = password;
		this.usuarioRoles = usuarioRoles2;
	}
	
	

}