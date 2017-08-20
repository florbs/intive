package com.intive;

import com.intive.utils.Driver;

public class BaseTest {

    public void setUp(String browserName, String url) {
        Driver.startBrowser(browserName);
        Driver.browser().navigate().to(url);
    }
}
