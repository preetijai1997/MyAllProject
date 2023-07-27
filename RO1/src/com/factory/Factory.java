package com.factory;

import org.testng.annotations.Test;

public class Factory {
	
	@Test
	
	@Factory
    public Object[] factoryMethod()
	{
		return new Object[]
				{
						new FactoryTest()
				};
				}
	}


