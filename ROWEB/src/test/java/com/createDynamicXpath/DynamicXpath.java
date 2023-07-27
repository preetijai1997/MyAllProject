package com.createDynamicXpath;

import org.openqa.selenium.By;

public class DynamicXpath {
	
public static By email=By.xpath(dynamicXpath("//input[@name='{0}']","preetijaiswal504@gmail.com"));
	public static String dynamicXpath(String xpath, Object ...args)
	{
		for(int i=0;i<args.length;i++)
		{
		xpath=	xpath.replace("{"+i+"}", (CharSequence) args[i]);
		}
		return xpath;
	}

	public static void main(String[] args) {
	String x1=	dynamicXpath("//input[@name='{0}']","test");
	System.out.println(x1);
	
	System.out.println(email.toString().substring(email.toString().indexOf("//")));

	}

}
