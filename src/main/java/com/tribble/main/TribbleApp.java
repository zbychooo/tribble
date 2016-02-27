package com.tribble.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tribble.dao.UserDao;
import com.tribble.model.User;

public class TribbleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        UserDao userDao = context.getBean(UserDao.class);
         
        User u = new User();
        u.setName("usr_name"); 
        u.setUsername("usr");
         
        userDao.create(u);
        
        List<User> all = userDao.fetchAll(User.class);
         
        for(User i : all){
            System.out.println("Person List::"+i);
        }
        //close resources
        context.close();    
		
	}
}