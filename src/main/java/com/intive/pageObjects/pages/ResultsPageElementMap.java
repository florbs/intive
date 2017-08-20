package com.intive.pageObjects.pages;

import com.intive.pageObjects.base.ElementMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultsPageElementMap extends ElementMap {

    protected WebElement seleniumPageLink() {
        return driver.findElement(By.cssSelector("a[href='http://www.seleniumhq.org/']"));
    }
}
