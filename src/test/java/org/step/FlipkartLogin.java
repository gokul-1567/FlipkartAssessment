package org.step;

import org.pojo.classes.FlipkartLoginPOJO;
import org.reusable.UtilityClass;

import cucumber.api.java.en.When;

public class FlipkartLogin extends UtilityClass {

	FlipkartLoginPOJO f;
	
	@When("User has to click login button")
	public void user_has_to_click_login_button() {
		implitWait();
	    f = new FlipkartLoginPOJO();
	    clickWebElement(f.getLogin());
	}
	
	@When("User has to enter mobile number in required field")
	public void user_has_to_enter_mobile_number_in_required_field() {
	    
		passTextToTextBox(f.getMobile(), "9597437438");
	}

	@When("User has to click request otp button")
	public void user_has_to_click_request_otp_button() {
	   
		clickWebElement(f.getRequestOtp());
	}
}
