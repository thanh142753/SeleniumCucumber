package widget.commonWidget;

import factory.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseWidget implements IBaseWidget {

    BaseClass baseClass = BaseClass.getInstance();

    @Override
    public WebElement getElementByXpath(String xpath) {
        return baseClass.getDriver().findElement(By.xpath(xpath));
    }
}
