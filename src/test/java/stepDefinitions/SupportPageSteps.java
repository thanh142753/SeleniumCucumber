package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObjects.DriverSupportPage;
import pageObjects.HomePage;


public class SupportPageSteps {

	 DriverSupportPage driverSupportPage = new DriverSupportPage();

	@And("I am on the driver support page")
	public void iAmOnTheDriverSupportPage() {
		driverSupportPage.getSupportWidget().switchToDriverSupportPage();
	}

	@And("I search for {string} from the text box search")
	public void iSearchForFromTheTextBoxSearch(String searchingValue) {
		driverSupportPage.getSupportWidget().SearchFromTheTextBoxSearch(searchingValue);
	}

	@And("I click on {string} and download file")
	public void iClickOn(String link) {
		driverSupportPage.getSupportWidget().clickOnTextToDownload(link);
	}

	@And("I verify the text {string} is displaying on the page")
	public void iVerifyTheTextIsDisplayingOnThePage(String text) {
		driverSupportPage.getSupportWidget().verifyTextIsOnThePage(text);
	}


}
