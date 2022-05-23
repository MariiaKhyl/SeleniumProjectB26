package com.cydeo.test.day1_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        // 1 - Setting up the Web Driver manager
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mashk\\OneDrive\\Desktop\\chromedriver.exe");

        // 2 - Create instance of the Chrome driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");



    }
}
