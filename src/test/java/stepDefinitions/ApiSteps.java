package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DriverSupportPage;
import widget.commonWidget.ApiWidget;
import widget.commonWidget.IApiWidget;


public class ApiSteps {

	 IApiWidget apiWidget = new ApiWidget();

	@Given("I get value of key {string} from request {string}")
	public void iGetValueOfKeyFromRequest(String key, String endPoint) {
		apiWidget.getValueOfKeyFromRequest(key, endPoint);
	}

	@Then("I verify the get request {string} with the parameter {string}")
	public void iVerifyTheGetRequestWithTheParameter(String endPoint, String parameter) {
		apiWidget.verifyTheGetRequestWithTheParameter(endPoint, parameter);
	}
}
