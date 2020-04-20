package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;



import java.util.Collection;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.Usuario;





/**
 *
 * @author Vass Chile
 */
public interface UsuarioService {

	public Usuario get(Integer id) throws Exception;
}
