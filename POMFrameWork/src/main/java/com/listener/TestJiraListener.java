package com.listener;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.util.JiraPolicy;
import com.util.JiraServiceProvider;

import net.rcarz.jiraclient.JiraException;

public class TestJiraListener implements ITestListener{
	
	public void onTestFailure(ITestResult result)
	{
		JiraPolicy jirapolicy=result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
	boolean isTicketReady=	jirapolicy.logTicketReady();
	if(isTicketReady)
	{
		System.out.println("ticket is ready :"+ isTicketReady);
		JiraServiceProvider jiraSP= new JiraServiceProvider("https://preetijaiswal.atlassian.net/","preetijaiswal504@gmail.com",
				"Preeti1234@","RET");
	String issueSummary=	result.getMethod().getConstructorOrMethod().getMethod().getName()+"test is fail due to some assertion or exception issue";
	String issueDescription=result.getThrowable().getMessage()+"\n";
	issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
	
	
			try {
				jiraSP.createJiraTicket("Bug", issueSummary, issueDescription, "Preeti");
			} catch (JiraException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
	}
	
	}

	

