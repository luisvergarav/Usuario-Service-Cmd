package com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;

/**
 *
 * @author VassChile
 */
public interface UsuarioRolesRepository<UsuarioRole, String> extends Repository<UsuarioRole, String> {

    
	public UsuarioRole get(UsuarioRolePK id) throws Exception;
	public UsuarioRole adding(UsuarioRole id) throws Exception;
}
