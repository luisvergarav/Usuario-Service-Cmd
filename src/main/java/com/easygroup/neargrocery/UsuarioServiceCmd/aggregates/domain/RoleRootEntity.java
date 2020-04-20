package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.Usuario;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;

class RoleRootEntity {
	private UsuarioRolePK id;

	private String authority;

	private Usuario usuario;

	public UsuarioRolePK getId() {
		return id;
	}

	public void setId(UsuarioRolePK id) {
		this.id = id;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public RoleRootEntity(UsuarioRolePK id, String authority) {
		super();
		this.id = id;
		this.authority = authority;
	}

	

}