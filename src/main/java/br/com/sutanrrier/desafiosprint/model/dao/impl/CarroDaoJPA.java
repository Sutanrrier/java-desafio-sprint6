package br.com.sutanrrier.desafiosprint.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sutanrrier.desafiosprint.connection.ConnectionFactory;
import br.com.sutanrrier.desafiosprint.model.dao.interfaces.GenericDao;
import br.com.sutanrrier.desafiosprint.model.entities.Carro;

public class CarroDaoJPA implements GenericDao<Carro>{

	@Override
	public void insert(Carro obj) {
		EntityManager em = ConnectionFactory.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao inserir Carro!");
			e.getMessage();
		}
		finally {
			em.close();
		}
	}

	@Override
	public void update(Carro obj) {
		EntityManager em = ConnectionFactory.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao atualizar informações do Carro!");
			e.getMessage();
		}
		finally {
			em.close();
		}
	}

	@Override
	public void remove(Integer id) {
		EntityManager em = ConnectionFactory.getEntityManager();
		try {
			Carro obj = em.find(Carro.class, id);
			
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao deletar carro!");
			e.getMessage();
		}
		finally {
			em.close();
		}
	}

	@Override
	public Carro findById(Integer id) {
		EntityManager em = ConnectionFactory.getEntityManager();
		Carro carro = null;
		
		try {
			carro = em.find(Carro.class, id);
		}
		catch(Exception e) {
			System.out.println("Erro ao procurar Carro!");
			e.getMessage();
		}
		finally {
			em.close();
		}
		return carro;
	}

	@Override
	public List<Carro> findAll() {
		EntityManager em = ConnectionFactory.getEntityManager();
		List<Carro> listaCarro = null;
		
		try {
			listaCarro = em.createQuery("FROM Carro c ORDER BY id", Carro.class).getResultList();
		}
		catch(Exception e) {
			System.out.println("Erro ao retornar todos os carros!");
			e.getMessage();
		}
		finally {
			em.close();
		}
		return listaCarro;
	}

}
