package com.tribble.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tribble.dao.TribbleDao;

@Repository
@Transactional
public abstract class TribbleDaoImpl implements TribbleDao {

	@PersistenceContext
	protected EntityManager entityManager;

	public <T> void create(T object) {
	    entityManager.persist(object);
	}

	@Override
	public <T> void update(T object) {
		entityManager.refresh(object);
	}

	@Override
	public <T> void delete(T object) {
		entityManager.remove(object);
	}

	@Override
	public <T> T fetchById(Class<T> clazz, T id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> List<T> fetchAll(Class<T> clazz) {
		return entityManager.createQuery("SELECT e FROM " + clazz.getName() + " e").getResultList();
	}
	
}
