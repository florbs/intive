package com.intive.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver browser;
    private static WebDriverWait wait;
    private static Wait fluentWait;

    private Driver() {
    }

    public static WebDriver browser() {
        if (browser == null) {
            Reporter.log("Browser has not been initialized yet. You should first call startbrowser method");
        }
        browser.manage().window().maximize();
        return browser;
    }

    public static WebDriverWait browserWait() {
        if (browser == null && wait == null) {
            Reporter.log("Browser has not been initialized. You should first call startbrowser method");
        }
        return wait;
    }

    public static Wait browserFluentWait() {
        if (browser == null && fluentWait == null) {
            Reporter.log("Browser has not been initialized. You should first call startbrowser method");
        }
        return fluentWait;
    }

    public static void startBrowser(String browserName) {
        if (browser == null && wait == null) {
            switch (browserName.toLowerCase()) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("disable-infobars");
                    browser = new ChromeDriver(options);
                    break;
                case "firefox":
                    File file = new File("geckodriver");
                    System.setProperty("webdriver.gecko.driver", file.getAbsoluteFile().getAbsolutePath());
                    DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                    capabilities.setCapability("marionette", true);
                    browser = new FirefoxDriver();
                    break;
                case "ie":
                    browser = new InternetExplorerDriver();
                    break;
                default:
                    ChromeOptions optionsDefault = new ChromeOptions();
                    optionsDefault.addArguments("disable-infobars");
                    browser = new ChromeDriver();
            }
            wait = new WebDriverWait(browser, 120);
            fluentWait = new FluentWait<>(browser)
                    .withTimeout(120, TimeUnit.SECONDS)
                    .pollingEvery(2, TimeUnit.SECONDS)
                    .ignoring(NoSuchElementException.class);
        }
    }

    public static void stopBrowser() {
        browser.quit();
        browser = null;
        wait = null;
        fluentWait = null;
    }
}
