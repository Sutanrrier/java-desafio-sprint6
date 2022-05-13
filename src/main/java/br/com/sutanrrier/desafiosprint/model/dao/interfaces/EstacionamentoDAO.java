package br.com.sutanrrier.desafiosprint.model.dao.interfaces;

import java.util.List;

import br.com.sutanrrier.desafiosprint.model.entities.Estacionamento;

public interface EstacionamentoDAO {
	void insert(Estacionamento obj);
	void update(Estacionamento obj);
	void remove(Integer id);
	Estacionamento findById(Integer id);
	List<Estacionamento> findAll();
}
