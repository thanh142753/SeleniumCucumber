package pageObjects;

import widget.commonWidget.HeaderWidget;
import widget.commonWidget.SearchWidget;

public class HomePage {

    private SearchWidget searchWidget;
    private HeaderWidget headerWidget;

    public SearchWidget getSearchWidget() {
        return searchWidget = new SearchWidget();
    }
    public HeaderWidget getHeaderWidget() {
        return headerWidget = new HeaderWidget();
    }
}
