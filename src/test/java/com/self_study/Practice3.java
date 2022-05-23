package com.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login2.nextbasecrm.com/");




        WebElement loginBtn = driver.findElement(By.cssSelector("input[class='login-btn']"));
        loginBtn.sendKeys("Log In"+ Keys.ENTER);


        Thread.sleep(3000);
        driver.quit();

    }
}
