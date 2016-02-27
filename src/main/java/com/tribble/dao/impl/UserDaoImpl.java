package com.tribble.dao.impl;

import org.springframework.transaction.annotation.Transactional;

import com.tribble.dao.UserDao;

@Transactional
public class UserDaoImpl extends TribbleDaoImpl implements UserDao {

	/*
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	public void save(User user) {
		
		Session session = this.sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
		
	}

	public List<User> getAll() {
		Session session = this.sessionFactory.openSession();
		List<User> list = session.createQuery("from User").list();
		session.close();
		
		return list;
	}
	//*/
}
