package com.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCydeoClassLocator {
    public static void main(String[] args) throws InterruptedException {

//        TC #4: Practice Cydeo – Class locator practice
//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        Thread.sleep(3000);

//        3- Click to “Home” link
        WebElement homePage = driver.findElement(By.className("nav-link"));
        homePage.click();
        Thread.sleep(2000);

//        4- Verify title is as expected:
//        Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equals(expectedTitle) ? "Title verification passed" : "Title verification failed");

//        PS: Locate “Home” link using “className” locator
        driver.quit();

    }
}
