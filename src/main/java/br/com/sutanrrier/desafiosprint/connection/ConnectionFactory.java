package br.com.sutanrrier.desafiosprint.connection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence_jpa");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
	
	public static void closeConnection() {
		emf.close();
	}
}
