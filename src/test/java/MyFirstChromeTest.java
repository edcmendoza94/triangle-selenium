/*
 * Edward Mendoza
 * November 8th, 2017
 * MyFirstChromeTest.java
 * Very simple class file that works and
 * runs a couple of tests with Selenium
 * WebDriver.
 */

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertTrue;

public class MyFirstChromeTest {
    @BeforeClass
    public static void setupChromeDriverLocation() {
        String chromeDriverLocation = "C:/Drivers_automation/ChromeDriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
    }

    @Test
    public void basicChromeUsage() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://the-internet.herokuapp.com/");
        assertTrue(chrome.getTitle().equals("The Internet"));
        chrome.quit();
    }

    @Test
    public void basicChromeUsageFailure() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://the-internet.herokuapp.com/");
        assertTrue(chrome.getTitle().equals("lol, internet"));
        chrome.quit();
    }
}
