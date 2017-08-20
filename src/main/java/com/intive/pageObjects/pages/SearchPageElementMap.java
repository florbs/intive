package com.intive.pageObjects.pages;

import com.intive.pageObjects.base.ElementMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchPageElementMap extends ElementMap {

    protected WebElement searchField(){
        return driver.findElement(By.name("q"));
    }
}
