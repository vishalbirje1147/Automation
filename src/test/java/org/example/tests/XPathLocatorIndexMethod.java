package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocatorIndexMethod {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//input[@name ='newsletter'])[1]")).click();
        driver.findElement(By.xpath("(//input[@name ='newsletter'])[2]")).click();
    }
}
