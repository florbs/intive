package com.intive.pageObjects.pages;

import com.intive.pageObjects.base.Page;

public class SearchPage extends Page {

    SearchPageElementMap map;

    public SearchPage(){
        super("http://www.google.com/");
        map = map(SearchPageElementMap.class);
    }

    public ResultsPage searchForText(String searchText){
        map.searchField().sendKeys(searchText);
        map.searchField().submit();
        return loadPage(ResultsPage.class);
    }
}
