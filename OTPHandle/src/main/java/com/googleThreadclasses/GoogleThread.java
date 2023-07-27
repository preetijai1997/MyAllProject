package com.googleThreadclasses;

import com.google.multithread.GooglePage;

public class GoogleThread extends Thread {
	
	public String browserName;
	
	GooglePage googlePage;
	
	public GoogleThread(String ThreadName, String browserName)
	{
		super(ThreadName);
		this.browserName=browserName;
	}
	

@Override
public void run()
{
	System.out.println("thread-name===="+Thread.currentThread().getName());
	try
	{
		Thread.sleep(3000);
		googlePage.setup(this.browserName);
		googlePage.googleTest();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	finally {
		googlePage.TearDown();
		System.out.println("Thread end"+ Thread.currentThread().getName());
	}
}
	
	

}
