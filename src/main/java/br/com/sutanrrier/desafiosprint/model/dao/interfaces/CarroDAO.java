package br.com.sutanrrier.desafiosprint.model.dao.interfaces;

import java.util.List;

import br.com.sutanrrier.desafiosprint.model.entities.Carro;

public interface CarroDAO {
	void insert(Carro obj);
	void update(Carro obj);
	void remove(Integer id);
	Carro findById(Integer id);
	List<Carro> findAll();
}
