package com.short_video;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13_LocateElementByXPATH {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        // search for cydeo
        WebElement searchBox =driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys("cydeo"+ Keys.ENTER);

        // verify Cydeo linkText is appeared in the results
        WebElement cydeoText = driver.findElement(By.xpath("//h3[.='Cydeo']"));

        System.out.println(cydeoText.getText().equals("Cydeo") ? "Cydeo text is appeared" : "Cydeo text did not appear");

        driver.quit();

    }
}
