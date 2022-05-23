package com.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfStudy {
    public static void main(String[] args) throws InterruptedException {

//        TC #1: Etsy Title Verification
//        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");
        Thread.sleep(2000);

//        3. Search for “Cat Butt Cookie Cutter”
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("Cat Butt Cookie Cutter"+ Keys.ENTER);

//        4. Verify title:
//        Expected: “Wooden spoon | Etsy”

        driver.quit();

    }
}
