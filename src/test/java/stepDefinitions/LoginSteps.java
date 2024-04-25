package stepDefinitions;

import io.cucumber.java.en.Given;
import pageObjects.HomePage;

public class LoginSteps {

     HomePage homePage2 = new HomePage();

    public LoginSteps() {
    }


    @Given("the user navigates to login page")
    public void user_navigate_to_login_page() {
        homePage2.getSearchWidget().enterProductName("vivo");
        homePage2.getSearchWidget().clickSearch();
                   
    }

}
