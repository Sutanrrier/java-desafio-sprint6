package br.com.sutanrrier.desafiosprint.model.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.sutanrrier.desafiosprint.connection.ConnectionFactory;
import br.com.sutanrrier.desafiosprint.model.dao.interfaces.EstacionamentoDAO;
import br.com.sutanrrier.desafiosprint.model.entities.Estacionamento;

public class EstacionamentoDAOImpl implements EstacionamentoDAO {

	@Override
	public void insert(Estacionamento obj) {
		EntityManager em = ConnectionFactory.getEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao inserir Estacionamento!");
			e.getMessage();
		}
		finally {
			em.close();
		}
	}

	@Override
	public void update(Estacionamento obj) {
		EntityManager em = ConnectionFactory.getEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao atualizar informações do Estacionamento!");
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
			Estacionamento obj = em.find(Estacionamento.class, id);
			
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		}
		catch(Exception e) {
			em.getTransaction().rollback();
			System.out.println("Erro ao deletar Estacionamento!");
			e.getMessage();
		}
		finally {
			em.close();
		}
	}

	@Override
	public Estacionamento findById(Integer id) {
		EntityManager em = ConnectionFactory.getEntityManager();
		Estacionamento estacionamento = null;
		
		try {
			estacionamento = em.find(Estacionamento.class, id);
		}
		catch(Exception e) {
			System.out.println("Erro ao procurar estacionamento!");
			e.getMessage();
		}
		finally {
			em.close();
		}
		return estacionamento;
	}

	@Override
	public List<Estacionamento> findAll() {
		EntityManager em = ConnectionFactory.getEntityManager();
		List<Estacionamento> listaEstacionamento = null;
		
		try {
			listaEstacionamento = em.createQuery("FROM Estacionamento e", Estacionamento.class).getResultList();
		}
		catch(Exception e) {
			System.out.println("Erro ao retornar todos os estacionamentos!");
			e.getMessage();
		}
		return listaEstacionamento;
	}

}
