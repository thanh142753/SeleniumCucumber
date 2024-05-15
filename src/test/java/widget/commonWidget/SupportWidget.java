package widget.commonWidget;

import factory.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

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
        getElementByXpath(DOWNLOAD_FILE_IN_ENGLISH).getAttribute("src");
        switchToNewWindow();
//        WebElement root=baseClass.getDriver().findElement(By.id("viewer"));
//        WebElement shadowdom1=getShadowDOM(root,baseClass.getDriver().getDriver());
//        WebElement toolbar=shadowdom1.findElement(By.tagName("viewer-toolbar"));
//        WebElement shadowdom2=getShadowDOM(toolbar,DriverManager.getDriver());
//        WebElement downloads=shadowdom2.findElement(By.tagName("viewer-download-controls"));
//        WebElement shadowdom3=getShadowDOM(downloads,DriverManager.getDriver());
//        WebElement crIconbutton =shadowdom3.findElement(By.tagName("cr-icon-button"));
//        WebElement shadowdom4=getShadowDOM(crIconbutton,DriverManager.getDriver());
//        WebElement downloadIcon =shadowdom4.findElement(By.tagName("iron-icon"));
//        Assert.assertTrue(downloadIcon.isDisplayed(),"No download option available");
//
//        JavascriptExecutor js = (JavascriptExecutor) baseClass.getDriver();
//        WebElement clearData = (WebElement) js.executeScript("return document.querySelector('viewer').shadowRoot.querySelector('viewer-toolbar').shadowRoot.querySelector('viewer-download-controls').shadowRoot.querySelector('iron-icon').shadowRoot.querySelector('settings-clear-browsing-data-dialog').shadowRoot.querySelector('#clearBrowsingDataDialog').querySelector('#clearBrowsingDataConfirm')");
//        clearData.click();
    }

    @Override
    public void verifyTextIsOnThePage(String text) {
        getElementByXpath(String.format(LINK_TO_DOWNLOAD_FILE, text)).isDisplayed();
    }
}
