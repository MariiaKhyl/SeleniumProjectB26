package com.short_video;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P11_LocatorsPractice1 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to https://app.vytrack.com/user/login
        driver.get("https://app.vytrack.com/user/login");

        // Enter user name provided: "abcd"
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("abcd");

        // Enter password provided: "abcd"
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("abcd");

        // Click on Login button
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        loginBtn.click();

        // Verify the message "Invalid user name or password."
        WebElement alert = driver.findElement(By.className("alert"));
        if (alert.getText().equals("Invalid user name or password.")){
            System.out.println("Message is passed");
        }else{
            System.out.println("Message is failed");
        }

        // verify URL contains "vytrack"
        String actualURL = driver.getCurrentUrl();
        if (actualURL.contains("vytrack")){
            System.out.println("URL is passed");
        }else{
            System.out.println("URL is failed");
        }

        // click "Forgot your password?" link
        driver.findElement(By.partialLinkText("Forgot")).click();

        // verify title is "Forgot Password"
        if (driver.getTitle().equals("Forgot Password")){
            System.out.println("Title is correct");
        }else{
            System.out.println("Title is not correct");
        }


    }
}
