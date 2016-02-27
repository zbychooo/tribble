package com.tribble.dao.impl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tribble.dao.TypeDefinitionDao;
import com.tribble.model.TypeDefinition;

public class TypeDefinitionDaoImplTest {

	private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("config.xml");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateTypeDefinition() {
		
		TypeDefinitionDao bean = context.getBean(TypeDefinitionDao.class);
		
		TypeDefinition typedef = new TypeDefinition();
		typedef.setDisplayName("displayName");
		typedef.setInternalName("internalName");
		typedef.setDescription("desc");
		typedef.setIconPath("iconPath");
		typedef.setInstantiable(false);
		bean.create(typedef);
		
	}

}
