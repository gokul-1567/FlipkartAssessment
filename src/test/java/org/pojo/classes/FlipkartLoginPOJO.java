package org.pojo.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reusable.UtilityClass;

public class FlipkartLoginPOJO extends UtilityClass {

	public FlipkartLoginPOJO() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Login']")
	private WebElement login;
	
	@FindBy(xpath="//input[@type='text' and @class='r4vIwl BV+Dqf']")
	private WebElement mobile;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement requestOtp;

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getRequestOtp() {
		return requestOtp;
	}
}
