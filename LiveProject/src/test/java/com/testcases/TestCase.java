package com.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase {
	
	
	public static void main(String[] args) throws IOException
	{
	Properties config= new Properties();
	Properties OR= new Properties();
	FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
    config.load(fis);
    
    fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\OR.properties");
    OR.load(fis);
    
    System.out.println(OR.getProperty("userId"));
}
}