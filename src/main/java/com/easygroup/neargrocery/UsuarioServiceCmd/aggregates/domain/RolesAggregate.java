package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.Usuario;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;

public class RolesAggregate {

	final RoleRootEntity roleRootEntity;

	public RolesAggregate(Builder builder) {
		this.roleRootEntity = new RoleRootEntity(
			builder.id,
			builder.authority);
	}

	public boolean isValid() {
		if (!this.roleRootEntity.getAuthority().equals(""))
			return true;
		else
			return false;
	}

	public static class Builder {
		private UsuarioRolePK id;

		private String authority;

		private Usuario usuario;

		
		public Builder setId(UsuarioRolePK id) {
			this.id = id;
			return this;
		}


		public Builder setAuthority(String authority) {
			this.authority = authority;
			return this;
		}


		public Builder setUsuario(Usuario usuario) {
			this.usuario = usuario;
			return this;
		}


		public RolesAggregate build() {

			return new RolesAggregate(this);
		}

	}
}
