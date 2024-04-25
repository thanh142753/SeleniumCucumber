package pageObjects;

import widget.commonWidget.SearchWidget;

public class HomePage {

    private SearchWidget searchWidget;

    public SearchWidget getSearchWidget() {
        return searchWidget = new SearchWidget();
    }
}
