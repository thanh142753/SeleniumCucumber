package widget.commonWidget;

import factory.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseWidget implements IBaseWidget {

    BaseClass baseClass = BaseClass.getInstance();
    Actions action = new Actions(baseClass.getDriver());

    @Override
    public WebElement getElementByXpath(String xpath) {
        return baseClass.getDriver().findElement(By.xpath(xpath));
    }

    @Override
    public void hoverOnElement(String xpath) {
        WebElement we = getElementByXpath(xpath);
        action.moveToElement(we).build().perform();
    }

    @Override
    public void switchToNewWindow() {
        for(String winHandle : baseClass.getDriver().getWindowHandles()){
            baseClass.getDriver().switchTo().window(winHandle);
        }
    }

}
