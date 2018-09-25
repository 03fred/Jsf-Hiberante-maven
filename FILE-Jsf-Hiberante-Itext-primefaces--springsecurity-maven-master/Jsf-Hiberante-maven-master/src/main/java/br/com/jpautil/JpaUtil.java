package br.com.jpautil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory factory = null;

	static {

		if (factory == null) {
		
			 factory = Persistence.createEntityManagerFactory("Projetojsf");

		}
	}
	
	
	public static EntityManager getEntityManager() {
		
		return factory.createEntityManager();
	}
} 
