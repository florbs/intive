package com.intive.pageObjects.pages;

import com.intive.pageObjects.base.Page;

public class ResultsPage extends Page {

    private ResultsPageElementMap map;

    public ResultsPage(){
        super("/search");
        map = map(ResultsPageElementMap.class);
    }
    public ResultsPage clickSeleniumLink() {
        map.seleniumPageLink().click();
        return null;
    }


}
