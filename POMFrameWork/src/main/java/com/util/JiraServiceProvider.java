package com.util;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {
	
	public JiraClient jira;
	public String project;
	public JiraServiceProvider(String url, String username, String password, String project)
	{
		BasicCredentials creds=new BasicCredentials(username,password);
		jira=new JiraClient(url, creds);
		this.project=project;
	}
	
	public void createJiraTicket(String issueType, String summary, String description, String reporterName) throws JiraException
	{
		try {
		FluentCreate fluentcreate=jira.createIssue(project, issueType);
		fluentcreate.field(Field.SUMMARY, summary);
		fluentcreate.field(Field.DESCRIPTION, description);
		Issue newissues=fluentcreate.execute();
		System.out.println("new ID is ===="+ newissues);
		}
		catch(JiraException e)
		{
			e.printStackTrace();
		}
		
	}

}
