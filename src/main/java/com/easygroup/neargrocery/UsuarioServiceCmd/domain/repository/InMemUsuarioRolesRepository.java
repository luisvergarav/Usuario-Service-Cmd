package com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRole;
import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.UsuarioRolePK;

import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Vass Chile
 */
@Repository("usuarioRolesRepository")
public class InMemUsuarioRolesRepository implements UsuarioRolesRepository<UsuarioRole, String> {

	private static final Logger log = Logger.getLogger(InMemUsuarioRolesRepository.class);
	SessionFactory sessionFactory;
	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemUsuarioRolesRepository(SessionFactory sessionFactory) throws Exception {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public UsuarioRole adding(UsuarioRole entity) {
		// TODO Auto-generated method stub
	    Session session = this.sessionFactory.getCurrentSession();
	    return (UsuarioRole) session.merge(entity);


	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.falabella.login.domain.repository.Repository#remove(java.lang.Object)
	 */
	@Override
	public void remove(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UsuarioRole entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UsuarioRole get(String id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	     return entitymanager.find( UsuarioRole.class, id);
	}

	@Override
	public Collection<UsuarioRole> getAll(String id) throws Exception {
		return null;
		

	}

	@Override
	public UsuarioRole get(UsuarioRolePK id) throws Exception {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	     return entitymanager.find( UsuarioRole.class, id);
	}

	@Override
	public boolean add(UsuarioRole entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
