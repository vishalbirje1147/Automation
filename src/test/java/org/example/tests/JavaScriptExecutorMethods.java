package org.example.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        WebElement btnLogin = driver.findElement(By.id("login-button"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",btnLogin);

//        js.executeScript("alert('Welcome to selenium training');");

        String title = js.executeScript("return document.title").toString();
        System.out.println("Title of the page i: " + title);
        String url = js.executeScript("return document.URL").toString();
        System.out.println("URL of the page is: " + url);

        js.executeScript("window.scrollBy(0,600)");



    }
}
