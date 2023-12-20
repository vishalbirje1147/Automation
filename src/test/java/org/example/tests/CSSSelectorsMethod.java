package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsMethod {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.cssSelector("input#input-password")).sendKeys("test@123");
        driver.findElement(By.cssSelector("input[value='Login']")).click();

    }
}
