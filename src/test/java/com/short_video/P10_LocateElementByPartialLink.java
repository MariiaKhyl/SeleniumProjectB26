package com.short_video;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P10_LocateElementByPartialLink {
    public static void main(String[] args) {

        // set up Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to google.com
        driver.get("https://google.com");

        // identify and save the "Helpful tips to fact check information online" element
        WebElement helpfulText = driver.findElement(By.partialLinkText("Helpful tips"));

        // printout text
        System.out.println(helpfulText.getText());


        //close the browser
        driver.quit();

    }
}
