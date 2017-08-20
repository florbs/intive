package com.intive.pageObjects.base;

import org.openqa.selenium.WebDriver;
import com.intive.utils.Driver;

public class ElementMap {

    protected WebDriver driver;

    protected ElementMap(){
        this.driver = Driver.browser();
    }
}

