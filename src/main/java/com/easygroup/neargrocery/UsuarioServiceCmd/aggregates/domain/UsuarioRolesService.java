package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;



import java.util.Collection;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;




/**
 *
 * @author Vass Chile
 */
public interface UsuarioRolesService {

	public UsuarioRole get(UsuarioRolePK id) throws Exception;
	public Collection<UsuarioRole> getAll(String id) throws Exception;
}
