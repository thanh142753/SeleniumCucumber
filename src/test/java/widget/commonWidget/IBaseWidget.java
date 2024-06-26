package widget.commonWidget;

import org.openqa.selenium.WebElement;

public interface IBaseWidget {

    WebElement getElementByXpath(String xpath);

    void hoverOnElement(String xpath);

    void switchToNewWindow();
}
