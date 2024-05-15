package pageObjects;

import widget.commonWidget.HeaderWidget;
import widget.commonWidget.SearchWidget;
import widget.commonWidget.SupportWidget;

public class DriverSupportPage {

    private SupportWidget supportWidget;

    public SupportWidget getSupportWidget() {
        return supportWidget = new SupportWidget();
    }
}
