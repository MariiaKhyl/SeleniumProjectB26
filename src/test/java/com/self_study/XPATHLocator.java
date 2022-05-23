package com.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATHLocator {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("instagram"+ Keys.ENTER);

        WebElement instText = driver.findElement(By.xpath("//h3[.='Instagram']"));

        System.out.println(instText.getText().equals("Instagram") ? "Passed": "Failed");

        driver.quit();

    }
}
