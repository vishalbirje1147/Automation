package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class OptionsMethods {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);

        select.selectByIndex(1);
        select.selectByIndex(2);
        select.selectByIndex(3);

        List<WebElement> options = select.getOptions();
        System.out.println("All options");
        for(WebElement e: options){
            System.out.println(e.getText());
        }
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        System.out.println("First selected option");
        System.out.println(firstSelectedOption.getText());

        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        System.out.println("All selected options");
        for(WebElement e: selectedOptions){
            System.out.println(e.getText());
        }



    }
}
