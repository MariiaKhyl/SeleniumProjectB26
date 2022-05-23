package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

//        1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2- Go to: https://google.com/
        driver.get("https://www.google.com");

//        3- Write “apple” in search box
       WebElement searchBox =driver.findElement(By.name("q"));
       searchBox.sendKeys("apple"+ Keys.ENTER);

//        4- Click google search button
//        5- Verify title:
//        Expected: Title should start with “apple” word
        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.startsWith(expectedTitle) ? "Title verification passed" : "Title verification is failed");
        Thread.sleep(3000);
        driver.quit();
    }
}
