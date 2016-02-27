package com.tribble.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tribble.dao.TypeDefinitionDao;
import com.tribble.model.TypeDefinition;

public class TribbleApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
		TypeDefinitionDao bean = context.getBean(TypeDefinitionDao.class);
		
		TypeDefinition typedef = new TypeDefinition();
		typedef.setDisplayName("displayName");
		typedef.setInternalName("internalName");
		typedef.setDescription("desc");
		typedef.setIconPath("iconPath");
		typedef.setInstantiable(false);
		bean.create(typedef);

		TypeDefinition typedef2 = new TypeDefinition();
		typedef2.setDisplayName("display2Name");
		typedef2.setInternalName("internal2Name");
		typedef2.setDescription("desc2");
		typedef2.setIconPath("iconPath2");
		typedef2.setInstantiable(true);
		bean.create(typedef2);		
		
   
		List<TypeDefinition> fetchAll = bean.fetchAll(TypeDefinition.class);
		for(TypeDefinition td : fetchAll) {
			System.out.println(td);
		}
		
        context.close();    
		
	}
}