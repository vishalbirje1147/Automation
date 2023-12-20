package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleMethod {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");

        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        Set<String> handles = driver.getWindowHandles();
        for(String handle: handles){
            if(!mainWindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        driver.findElement(By.tagName("text")).sendKeys("Automation Testing");
        driver.findElement(By.xpath("//button[text()='Search']")).click();


    }
}
