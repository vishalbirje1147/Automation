package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorTextMethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
        if(driver.findElement(By.xpath("//h1[text]()= 'Shopping Cart']")).isDisplayed()){
            System.out.println("Shopping cart page is displayed");

        }
        else{
            System.out.println("Shopping cart page is not displayed");
        }
    }
}
