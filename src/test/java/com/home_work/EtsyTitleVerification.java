package com.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {

//        TC #1: Etsy Title Verification


//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

//        3. Search for “wooden spoon”
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);
        Thread.sleep(3000);

//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equals(expectedTitle) ? "Title verification passed" : "Title verification failed");


        Thread.sleep(2000);
        driver.quit();
    }
}
