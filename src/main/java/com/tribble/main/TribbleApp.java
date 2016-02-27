package com.tribble.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TribbleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
//        UserDao userDao = context.getBean(UserDao.class);
//         
//        User u = new User();
//        u.setName("usr_name"); 
//        u.setUsername("usr");
//    
//        userDao.create(u);
//        
//        User u2 = new User();
//        u2.setName("222");
//        u2.setUsername("us");
//        userDao.create(u2);
//        
//        
//        
//        List<User> all = userDao.fetchAll(User.class);
//         
//        for(User i : all){
//            System.out.println("Person List::"+i);
//        }
   
        context.close();    
		
	}
}