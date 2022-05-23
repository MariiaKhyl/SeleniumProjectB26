package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoVerifications {
    public static void main(String[] args) {
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com/
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
 */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl(); // it comes from Seleniun

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification is passed");
        }else{
            System.out.println("URL verification is failed");
        }

        String expectedTitle= "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification passed!");
        }else{
            System.out.println("Title verification failed!");
        }

        driver.quit();

    }
}
