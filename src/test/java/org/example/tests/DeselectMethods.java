package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);
        select.selectByValue("USA");
        select.selectByVisibleText("Russia");
        select.selectByIndex(3);

        select.deselectByValue("USA");
        select.deselectByIndex(3);
        select.deselectAll();

    }
}
