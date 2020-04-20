package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository.UsuarioRolesRepository;



/**
 *
 * @author Vass Chile
 */
@Service("usuarioRolesService")
public abstract class UsuarioRolesServiceImpl extends BaseService<UsuarioRole, String> implements UsuarioRolesService {
 
	private UsuarioRolesRepository<UsuarioRole, String> usuarioRolesRepository;

	/**
	 *
	 * @param AlmacenVO
	 *            Repository
	 */
	@Autowired
	public UsuarioRolesServiceImpl(UsuarioRolesRepository<UsuarioRole, String> usuarioRolesRepository) {
		super(usuarioRolesRepository);
		this.usuarioRolesRepository = usuarioRolesRepository;
	}

	@Override
	public UsuarioRole get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (UsuarioRole) usuarioRolesRepository.get(id);
	}
	@Override
	public Collection<UsuarioRole> getAll(String id) throws Exception {
		return this.usuarioRolesRepository.getAll(id);		
		
	}

	@Override
	public UsuarioRole get(UsuarioRolePK id) throws Exception {
		// TODO Auto-generated method stub
		return (UsuarioRole) usuarioRolesRepository.get(id);
	}

}
