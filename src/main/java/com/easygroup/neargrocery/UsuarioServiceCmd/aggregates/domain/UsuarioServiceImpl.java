package com.easygroup.neargrocery.UsuarioServiceCmd.aggregates.domain;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.Usuario;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository.UsuarioRepository;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository.UsuarioRolesRepository;


/**
 *
 * @author Vass Chile
 */
@Service("usuarioService")
public class UsuarioServiceImpl extends BaseService<Usuario, String> implements UsuarioService {
 
	private UsuarioRepository<Usuario, String> usuarioRepository;
	@Autowired
	private UsuarioRolesRepository<UsuarioRole, String> usuarioRolesRepository;
	/**
	 *
	 * @param Poliza
	 *            Repository
	 */
	@Autowired
	public UsuarioServiceImpl(UsuarioRepository<Usuario, String> polizaRepository) {
		super(polizaRepository);
		this.usuarioRepository = polizaRepository;
	}

	@Override
	public Usuario get(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return (Usuario) usuarioRepository.get(id);
	}
	@Override
	public Collection<Usuario> getAll(String id) throws Exception {
		return this.usuarioRepository.getAll(id);		
		
	}

	@Override
	public Usuario get(String id) throws Exception {
		// TODO Auto-generated method stub
		return (Usuario) usuarioRepository.get(id);
	}
	
	public void add(UsuarioAggregate entity) throws Exception {
		

		Usuario usuario = new Usuario();
		usuario.setActivo(entity.usuarioRootEntity.getActivo());
		usuario.setNombre(entity.usuarioRootEntity.getNombre());
		usuario.setNick(entity.usuarioRootEntity.getNick());
		usuario.setPassword(entity.usuarioRootEntity.getPassword());
		usuario.setRole(entity.usuarioRootEntity.getUsuarioRoles().get(0).getAuthority());
		try {		
			this.usuarioRepository.add(usuario);
			
			UsuarioRole ur = entity.usuarioRootEntity.getUsuarioRoles().get(0);
			ur.getId().setIdUsuario(usuario.getIdUsuario());
			this.usuarioRolesRepository.adding(ur);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		
		
	}

}
