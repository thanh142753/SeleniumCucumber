package widget.commonWidget;

import widget.elementLocator.BaseWidgetElementLocator;

public class SearchWidget extends BaseWidget implements ISearchWidget {

    // String xpath
//    String TEXT_BOX_SEARCH = "//*[@id='search']//input";
    String BTN_SEARCH = "//*[@id='search']//button";

    @Override
    public void enterProductName(String pName)   //For Search Product Test
    {
//		txtSearchbox.sendKeys(pName);
        getElementByXpath(BaseWidgetElementLocator.TEXT_BOX_SEARCH).sendKeys("vivo");
    }
    //
    @Override
    public void clickSearch()  //For Search Product Test
    {
//		btnSearch.click();
        getElementByXpath(BTN_SEARCH).click();
    }

}
