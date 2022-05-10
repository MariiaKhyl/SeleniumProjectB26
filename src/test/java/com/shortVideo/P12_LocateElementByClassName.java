package com.shortVideo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByClassName {
    public static void main(String[] args) {

        // set up Chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to Google
        driver.get("https://google.com");

        // identify and save the "Helpful tips to fact check information online" element
        WebElement helpfulText = driver.findElement(By.className("NKcBbd"));

        // verify the "Helpful tips to fact check information online" text appear correctly
        if (helpfulText.getText().equals("Helpful tips to fact check information online")){
            System.out.println("Text appears correctly");
        }else{
            System.out.println("Text does not appear correctly");
        }

        // close the browser
        driver.quit();


    }
}
