package Settlement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class uberbooking {

	
	@Given("User wants to select {string} from the Uber App")
	public void user_wants_to_select_from_the_uber_app(String carType) {
	   System.out.println("Step 1: "+ carType); 
	}

	@When("User select {string} from the options which is avaiable and pick up point {string} to {string}")
	public void user_select_from_the_options_which_is_avaiable_and_pick_up_point_to(String carType, String pickUpLoc, String dropLoc) {
	   System.out.println("Step 2: "+ carType+" "+ pickUpLoc+" "+dropLoc); 
	}

	@When("User pay {int} Ruppees")
	public void user_pay_ruppees(Integer charge) {
	    System.out.println("Step 3 "+charge);
	}
}
