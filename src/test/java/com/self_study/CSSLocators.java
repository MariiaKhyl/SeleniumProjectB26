package com.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
        searchBox.sendKeys("facebook"+ Keys.ENTER);

        WebElement facebookText = driver.findElement(By.cssSelector("a[href='https://www.facebook.com/']>h3"));

        System.out.println(facebookText.getText().contains("Facebook") ? "Passed" : "Failed");


        Thread.sleep(3000);
        driver.quit();
    }
}
