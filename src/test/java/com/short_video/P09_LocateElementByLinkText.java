package com.short_video;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P09_LocateElementByLinkText {
    public static void main(String[] args) {

        // set up Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://google.com");

        // identify and save the About link element on the top
        WebElement aboutLink = driver.findElement(By.linkText("About"));

        // Click on the link
        aboutLink.click();

        // close the browser
        driver.quit();

    }
}
