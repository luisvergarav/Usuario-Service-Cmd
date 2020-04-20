package com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the UsuarioRoles database table.
 * 
 */
@Embeddable
public class UsuarioRolePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int usuarioRolesId;

	private int idUsuario;

	public UsuarioRolePK() {
	}
	public int getUsuarioRolesId() {
		return this.usuarioRolesId;
	}
	public void setUsuarioRolesId(int usuarioRolesId) {
		this.usuarioRolesId = usuarioRolesId;
	}
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioRolePK)) {
			return false;
		}
		UsuarioRolePK castOther = (UsuarioRolePK)other;
		return 
			(this.usuarioRolesId == castOther.usuarioRolesId)
			&& (this.idUsuario == castOther.idUsuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.usuarioRolesId;
		hash = hash * prime + this.idUsuario;
		
		return hash;
	}
}