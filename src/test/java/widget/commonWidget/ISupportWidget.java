package widget.commonWidget;

public interface ISupportWidget extends IBaseWidget{


    void switchToDriverSupportPage();

    void SearchFromTheTextBoxSearch(String searchingValue);

    void clickOnTextToDownload(String link);

    void verifyTextIsOnThePage(String text);
}
