package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;

import java.util.Arrays;
import java.util.List;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;

public class UsuarioAggregate {

	final UsuarioRootEntity usuarioRootEntity;

	public UsuarioAggregate(Builder builder) {
		this.usuarioRootEntity = new UsuarioRootEntity(
				builder.idUsuario,
				builder.activo,
				builder.nick,
				builder.nombre,
				builder.password,
				builder.usuarioRoles);
	}

	public boolean isValid() {
		if (!this.usuarioRootEntity.getNick().equals(""))
			return true;
		else
			return false;
	}

	public static class Builder {
		private int idUsuario;

		private int activo;

		private String nick;

		private String nombre;

		private String password;

		private List<UsuarioRole> usuarioRoles;

		public Builder setIdUsuario(int idUsuario) {
			this.idUsuario = idUsuario;
			return this;
		}

		public Builder setActivo(int activo) {
			this.activo = activo;
			return this;
		}

		public Builder setNick(String nick) {
			this.nick = nick;
			return this;
		}

		public Builder setNombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public Builder setUsuarioRoles(List<String> usuarioRoles) {
			UsuarioRole ur = new UsuarioRole();
			ur.setAuthority(usuarioRoles.get(0));
			UsuarioRolePK urpk = new UsuarioRolePK();
			ur.setId(urpk);
			this.usuarioRoles = Arrays.asList(ur);
			
			return this;
		}

		public UsuarioAggregate build() {

			return new UsuarioAggregate(this);
		}

	}
}
