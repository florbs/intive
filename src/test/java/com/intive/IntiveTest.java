package com.intive;

import com.intive.pageObjects.pages.SearchPage;
import com.intive.utils.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IntiveTest extends BaseTest {

    @BeforeTest
    @Parameters({"browserName", "url"})
    public void startTest(String browserName, String url){
        setUp(browserName, url);
    }

    @Test
    @Parameters({"urlText", "expectedUrl"})
    public void searchTest(String urlText, String expectedUrl ) {
        SearchPage searchPage = new SearchPage();
        searchPage
                .searchForText(urlText)
                .clickSeleniumLink();
        Assert.assertEquals(Driver.browser().getCurrentUrl(), expectedUrl);
    }

    @AfterTest
    public void tearDown(){
        Driver.stopBrowser();
    }
}
