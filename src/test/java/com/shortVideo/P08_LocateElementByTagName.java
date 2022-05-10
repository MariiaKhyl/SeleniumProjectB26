package com.shortVideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P08_LocateElementByTagName {
    public static void main(String[] args) {

        // set up Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://practice.cydeo.com/
        driver.get("https://practice.cydeo.com/");

        // identify and save the "Test Automation Practice" element
        WebElement text = driver.findElement(By.tagName("h1"));

        // print out the text
        System.out.println(text.getText());

        // close the browser
        driver.quit();


    }
}
