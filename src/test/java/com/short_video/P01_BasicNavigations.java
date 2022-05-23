package com.short_video;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");

        //navigate().to() method is for navigation to web page
        //driver.navigate().to("https://www.etsy.com");

        //It is using for stopping app. We are giving time to app to see steps
        Thread.sleep(3000);

        //navigate().back() method is for navigating to back from web page
        driver.navigate().back();

        Thread.sleep(3000);

        // navigate().forward() method is for navigating to forward from web page
        driver.navigate().forward();

        Thread.sleep(3000);
        // navigate().refresh() method is for refreshing the page
        driver.navigate().refresh();


        System.out.println("driver.getTitle() = " + driver.getTitle());

        // String currentTitle = driver.getTitle();

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Thread.sleep(3000);
        // Make our page full screen
        driver.manage().window().maximize(); // or fullscreen();

        driver.get("https://www.tesla.com");

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();

        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // this will closed the currently opened page
        driver.close();

        // this will close open browser web page
        driver.quit();




    }
}
