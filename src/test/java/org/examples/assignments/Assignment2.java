package org.examples.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://gmail.com");
        String title = driver.getTitle();
        if (title.equals("Gmail")){
            System.out.println("Title is correct");
        }
        else {
            System.out.println("Title is incorrect");
        }

        driver.quit();

    }
}
