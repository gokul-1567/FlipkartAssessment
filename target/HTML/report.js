$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Product.feature");
formatter.feature({
  "name": "To Validate Add To Cart Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_launch_the_browser_and_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate product search functionality in flipkart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to search the product through search box",
  "keyword": "When "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_search_the_product_through_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select and adding product into cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_select_and_adding_product_into_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "User has to launch the browser and flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_launch_the_browser_and_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate login functionality in flipkart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLogin.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter mobile number in required field",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLogin.user_has_to_enter_mobile_number_in_required_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click request otp button",
  "keyword": "When "
});
formatter.match({
  "location": "FlipkartLogin.user_has_to_click_request_otp_button()"
});
formatter.result({
  "status": "passed"
});
});