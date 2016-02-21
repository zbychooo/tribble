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
         
        //userDao.save(u);
         
        //System.out.println("Useer::"+u);
         
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        List<User> all = userDao.getAll();
         
        for(User i : all){
            System.out.println("Person List::"+i);
        }
        //close resources
        context.close();    
		
	}
}