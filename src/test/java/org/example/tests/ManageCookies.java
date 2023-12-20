package org.example.tests;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class ManageCookies {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println(cookies);

        Cookie curr = driver.manage().getCookieNamed("currency");
        System.out.println(curr);

        Cookie customcookie =  new Cookie("user","tester");
        driver.manage().addCookie(customcookie);

        System.out.println(driver.manage().getCookieNamed("user"));

        driver.manage().deleteCookie(customcookie);
        driver.manage().deleteCookieNamed("currency");

        driver.manage().deleteAllCookies();

        Set<Cookie> cookies1 = driver.manage().getCookies();
        System.out.println(cookies1);


    }
}
