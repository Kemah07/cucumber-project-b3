package io.loop.utilities;
/*
* create a static method getDriver
* Accepts argument String - browserType
* returns webdriver
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverUtil {

    /**
     *
     * @param browserType
     * @return the driver of that browser
     * @author Kanan
     */

    public static WebDriver getDriver(String browserType) {
        if(browserType.equalsIgnoreCase("chrome")) {
            return new ChromeDriver();
        } else if(browserType.equalsIgnoreCase("firefox")) {
            return new FirefoxDriver();
        } else if (browserType.equalsIgnoreCase("safari")) {
            return new SafariDriver();
        } else {
            System.out.println("No driver is found");
            System.out.println("Driver is null");
            return null;

        }
    }
}
