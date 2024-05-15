package widget.commonWidget;

import org.junit.Assert;

public class HeaderWidget extends BaseWidget implements IHeaderWidget {


    String MENU_BAR = "//*[@id='hs_cos_wrapper_mainmenu']";
    String MENU_BAR_MODULE = MENU_BAR + "//*[@role='menu']//*[text()='%s']";
    String MENU_BAR_CHILDREN_MODULE = MENU_BAR + "//*[@class='hs-menu-children-wrapper']//*[text()='%s']";


    @Override
    public void verifyTheHomePageIsOpened() {
        Assert.assertTrue(getElementByXpath(MENU_BAR).isDisplayed());
    }

    @Override
    public void hoverOnTheModuleInTheMenuBar(String moduleName) {
        hoverOnElement(String.format(MENU_BAR_MODULE, moduleName));
    }

    @Override
    public void clickOnTheOptionOfChildrenMenu(String option) {
        getElementByXpath(String.format(MENU_BAR_CHILDREN_MODULE, option)).click();
    }

}
