package com.home_work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

// Back and forth navigation

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //1- Open a chrome browser
        // 2- Go to: https://google.com
        driver.get("https://www.google.com");

        //3- Click to Gmail from top right.
        WebElement linkText = driver.findElement(By.linkText("Gmail"));
        linkText.click();
        Thread.sleep(3000);

        //4- Verify title contains:
        //  Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.contains(expectedTitle) ? "Contain Gmail Title": "Not contain Gmail Title");

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);

        //6- Verify title equals:
        //  Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();


        System.out.println(actualTitle.equals(expectedTitle) ? "Title verification passed" : "Title verification failed");

        driver.quit();
    }
}
