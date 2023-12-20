package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();

        driver.findElement(By.id("input-email")).sendKeys("patebij@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value = 'Login']")).click();

        driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled();

        if (driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).isEnabled()){
            System.out.println("Logout link is present in homepage");
        }
        else{
            System.out.println("Logout link is not present in homepage");
        }


    }
}
