package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class XPathAxesMethods {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='input-firstname']//following::input[1]")).sendKeys("Smith");

        driver.findElement(By.xpath("//input[@value='Continue']//ancestor::div[1]/a")).click();

        driver.findElement(By.xpath("//input[@name='agree']//following-sibling::input")).click();

        driver.navigate().refresh();

//        String actualText = driver.findElement(By.xpath("//a[text()='login page']//parent::p")).getText();
//        if(actualText.equals("If you already have an account with us, please login at the login page.")){
//            System.out.println("Text is matching");
//        }
//        else{
//            System.out.println("Text is not matching");
    //     }

            driver.findElement(By.xpath("//div[@id='content']//descendant::input[4]")).sendKeys("test1@gmail.com");


        }
    }

