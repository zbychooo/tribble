package com.tribble.dao;

import java.util.List;

public interface TribbleDao {

	public <T> void create(T object);
	public <T> void update(T object);
	public <T> void delete(T object);
	public <T> T fetchById(Class<T> clazz, T id);
	public <T> List<T> fetchAll(Class<T> clazz);

}
