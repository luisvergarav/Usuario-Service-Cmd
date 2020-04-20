package com.easygroup.neargrocery.UsuarioServiceCmd.domain.repository;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.easygroup.neargrocery.UsuarioServiceCmd.domain.entities.Usuario;


/**
 *
 * @author Vass Chile
 */
@Repository("usuarioRepository")
public class InMemUsuarioRepository implements UsuarioRepository<Usuario, String> {

	private static final Logger log = Logger.getLogger(InMemUsuarioRepository.class);

	private SessionFactory sessionFactory;
    
	/**
	 * Initializep
	 * 
	 * @throws Exception
	 */
	public InMemUsuarioRepository(SessionFactory sessionFactory) throws Exception {
		this.sessionFactory = sessionFactory;
	}

	
    
	@Transactional
	@Override
	public boolean add(Usuario entity) {
		// TODO Auto-generated method stub
//		 EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
//	      EntityManager entitymanager = emfactory.createEntityManager( );
//	      entitymanager.getTransaction( ).begin( );

	      Session session = this.sessionFactory.getCurrentSession();
	      
	      session.persist(entity);

	      
	      return true;

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

	@Transactional
	@Override
	public void update(Usuario entity) {
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
//	      EntityManager entitymanager = emfactory.createEntityManager( );
	      Session session = this.sessionFactory.getCurrentSession();
	      
	      session.getTransaction( ).begin( );

	      
	      
	      session.merge(entity);
	      session.getTransaction( ).commit( );


	}

	@Override
	public boolean contains(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario get(String id) throws Exception {

//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
//	      EntityManager entitymanager = emfactory.createEntityManager();
//
	    Session session = this.sessionFactory.getCurrentSession();
			
	     Query query =  session.createQuery(
	    	        "SELECT u FROM Usuario u WHERE u.nick LIKE :nick")
	    	        .setParameter("nick", id);
	     
//	     entitymanager.clear();

	     
	     return (Usuario)query.getSingleResult();
	     
	}

	@Override
	public Collection<Usuario> getAll(String id) throws Exception {
		return null;
		

	}

	@Override
	public Usuario get(Integer id) throws Exception {
//		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "mysql-eclipselink" );
//	      EntityManager entitymanager = emfactory.createEntityManager();
		
		 Session session = this.sessionFactory.getCurrentSession();
		 
	     return session.find( Usuario.class, id);
	}

}
