package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathSelectorStartsWithMethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();

        if(driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).isDisplayed()) {
            System.out.println("Element is displayed on the page");

            driver.findElement(By.xpath("//img[starts-with(@title,'Canon')]")).click();

        }

    }
}
