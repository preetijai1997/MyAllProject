package com_practice_login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
public class Login {
	
	@Given("First open the Google")
	public void First_open()
	{
		System.out.println("First open the Google");
	}
    @Then("hit the url")
    public void hit()
    {
    	System.out.println("hit the url");
    }
    
    @And("then enter the user name with preeti id")
    public void then_enter()
    {
    	System.out.println("then enter the user name with preeti id");
    }
    @And("then enter the password")
    public void then_enter_the()
    {
    	System.out.println("then enter the password");
    }
    @And("then hit on the submit button")
    public void then_hit_on()
    {
    	System.out.println("then hit on the submit button");
    }
    @But("other user want to login with amit malu id")
    public void other_user()
    {
    	System.out.println("other user want to login with amit malu id");
    }
    @Then("again enter the user name of amit malu")
    public void again_enter()
    {
    	System.out.println("again enter the user name of amit malu");
    }
    @And("enter the password")
    public void enter_pass()
    {
    	System.out.println("enter the password");
    }
    @When("hit on Login button")
    public void hit_on_login()
    {
    	System.out.println("hit on Login button");
    }
    @Then("land on the home page")
    public void land_on()
    {
    	System.out.println("land on the home page");
    }

}
