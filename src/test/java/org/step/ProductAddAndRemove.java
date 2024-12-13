package org.step;

import java.awt.AWTException;
import java.io.IOException;

import org.junit.Assert;
import org.pojo.classes.AddToCartPagePOJO;
import org.pojo.classes.HomePagePOJO;
import org.pojo.classes.ProductPOJO;
import org.reusable.UtilityClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProductAddAndRemove extends UtilityClass{
	
	HomePagePOJO h;
	ProductPOJO p;
	AddToCartPagePOJO a;
	
	@Given("User has to launch the browser and flipkart application")
	public void user_has_to_launch_the_browser_and_flipkart_application() throws IOException {

		launchBrowser(readFromExcel("Sheet1", 1, 0));
		launchUrl(readFromExcel("Sheet1", 1, 1));
		implitWait();
	}

	@When("User has to search the product through search box")
	public void user_has_to_search_the_product_through_search_box() throws AWTException, IOException {

		h = new HomePagePOJO();
		String fromExcel = readFromExcel("Sheet1", 1, 2);
		passTextToTextBox(h.getSearchBox(),fromExcel );
		pressEnter(); 
	}

	@When("User has to select and adding product into cart")
	public void user_has_to_select_and_adding_product_into_cart() {
	    
		p = new ProductPOJO();
		driver.navigate().refresh();
		clickWebElement(p.getProduct());
		switchToAnotherWindow(1);
		driver.navigate().refresh();
		clickWebElement(p.getAddToCart());	
	}

	@When("User has to place order")
	public void user_has_to_place_order() throws Exception {
	    
		pageDown();
		a = new AddToCartPagePOJO();
		Assert.assertTrue("Wrong Product Added Into Card", a.getProductCheck().getText().contains("iPhone"));
		clickWebElement(a.getPlaceOrder());
	}


	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() throws InterruptedException {
	    
		Thread.sleep(5000);
		closeBrowser();
	}
}
