package StepDefinition;

import Settlement.successMeassage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class deletebank {
	successMeassage message;
	
@Given("Select the Bank Account Number from the dropdown list")
public void select_the_bank_account_number_from_the_dropdown_list() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 1: Select bank account number");

}

@Then("Data should be fetched")
public void data_should_be_fetched() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("step 2: Data should be fetch");
    
}

@When("Hit on Submit button")
public void hit_on_submit_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 3: Hit submit button");
   
}

@Then("Bank account number should be deleted and success message should be displayed {string}.")
public void bank_account_number_should_be_deleted_and_success_message_should_be_displayed(String SuccessMessage) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Step 4: Success message should be display:"+ SuccessMessage );
	message = new successMeassage(SuccessMessage);
   
}

	
	}


