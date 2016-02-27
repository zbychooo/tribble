package com.tribble.util;

import org.junit.Before;
import org.junit.Test;
import org.springframework.util.Assert;

public class TribblePropertiesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetStringTypeProperty() {
		Object object = TribbleProperties.getProperty("com.tribble.test.string");
		Assert.notNull(object);
		Assert.isInstanceOf(String.class, object);	
	}
	
	@Test
	public void testGetNumberTypeProperty() {
		Object object = TribbleProperties.getProperty("com.tribble.test.number");
		Assert.notNull(object);
		Long valueOf = Long.valueOf(String.valueOf(object));
		Assert.isInstanceOf(Number.class, valueOf);
	}

	@Test
	public void testGetPropertyWhichNotExist() {
		Object object = TribbleProperties.getProperty("com.tribble.test.nonexist.sure");
		Assert.isNull(object);
	}
}
