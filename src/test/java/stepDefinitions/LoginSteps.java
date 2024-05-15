package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class LoginSteps {

     HomePage homePage = new HomePage();

    public LoginSteps() {
    }


    @Given("the user navigates to login page")
    public void user_navigate_to_login_page() {
        homePage.getSearchWidget().enterProductName("vivo");
        homePage.getSearchWidget().clickSearch();
                   
    }

    @Given("I am on the home page")
    public void iAmOnTheHomePage() {
        homePage.getHeaderWidget().verifyTheHomePageIsOpened();
    }
}
