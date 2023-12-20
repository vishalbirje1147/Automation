package org.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to( "https://google.com");

        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.navigate().to( "https://gmail.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
