package com.tribble.dao;

import java.io.Serializable;
import java.util.List;

public interface TribbleDao {

	public <T> Serializable create(final T entity);   
    public <T> T update(final T entity);
    public <T> void delete(final T entity);
    public <T> void delete(Serializable id, Class<T> entityClass);
    public <T> List<T> fetchAll(Class<T> entityClass);
    public <T> List<T> fetchAll(String query);
    public <T> T fetchById(Serializable id, Class<T> entityClass);
}
