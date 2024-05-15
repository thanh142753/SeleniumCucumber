package stepDefinitions;

import io.cucumber.java.en.And;
import pageObjects.HomePage;


public class HomePageSteps {

	 HomePage homePage = new HomePage();


	@And("I hover on the {string} in the menu bar")
	public void iHoverOnTheInTheMenuBar(String moduleName) {
		homePage.getHeaderWidget().hoverOnTheModuleInTheMenuBar(moduleName);
	}

	@And("I click on the {string} in the {string} menu of the menu bar")
	public void iClickOnTheInTheMenuOfTheMenuBar(String option, String moduleName) {
		homePage.getHeaderWidget().hoverOnTheModuleInTheMenuBar(moduleName);
		homePage.getHeaderWidget().clickOnTheOptionOfChildrenMenu(option);
	}


}
