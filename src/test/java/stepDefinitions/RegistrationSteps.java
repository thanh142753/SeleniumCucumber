package stepDefinitions;

import io.cucumber.java.en.And;

import pageObjects.HomePage;


public class RegistrationSteps {

	 HomePage homePage = new HomePage();


	@And("I click on st")
	public void iClickOnSt() {
		homePage.getSearchWidget().clickSearch();
	}
}
