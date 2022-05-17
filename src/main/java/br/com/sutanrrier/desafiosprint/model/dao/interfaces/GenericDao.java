package br.com.sutanrrier.desafiosprint.model.dao.interfaces;

import java.util.List;

public interface GenericDao<T> {
	void insert(T obj);
	void update(T obj);
	void remove(Integer id);
	T findById(Integer id);
	List<T> findAll();
}
