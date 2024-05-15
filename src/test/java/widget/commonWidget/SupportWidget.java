package widget.commonWidget;

import factory.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static io.restassured.RestAssured.given;

public class SupportWidget extends BaseWidget implements ISupportWidget {
    BaseClass baseClass = BaseClass.getInstance();

    String TEXT_BOX_SEARCH = "//*[@class='kb-search__input']";
    String LINK_TO_DOWNLOAD_FILE = "//*[normalize-space()='%s']";
    String DOWNLOAD_FILE_IN_ENGLISH = "//a[@href='https://23365496.fs1.hubspotusercontent-na1.net/hubfs/23365496/Driver%20Training%20-%20Jitsu.pdf']";



    @Override
    public void switchToDriverSupportPage() {
        switchToNewWindow();
        Assert.assertTrue(getElementByXpath(TEXT_BOX_SEARCH).isDisplayed());
    }

    @Override
    public void SearchFromTheTextBoxSearch(String searchingValue) {
        getElementByXpath(TEXT_BOX_SEARCH).sendKeys(searchingValue);
        getElementByXpath(TEXT_BOX_SEARCH).sendKeys(Keys.ENTER);
    }

    @Override
    public void clickOnTextToDownload(String link) {
        getElementByXpath(String.format(LINK_TO_DOWNLOAD_FILE, link)).click();
        given().baseUri(getElementByXpath(DOWNLOAD_FILE_IN_ENGLISH).getAttribute("href")).when().get().then().assertThat().statusCode(200);
    }

    @Override
    public void verifyTextIsOnThePage(String text) {
        getElementByXpath(String.format(LINK_TO_DOWNLOAD_FILE, text)).isDisplayed();
    }
}
