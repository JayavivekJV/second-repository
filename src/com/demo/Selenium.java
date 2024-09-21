package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
	     WebDriver driver=new ChromeDriver();
         driver.get("https://www.netflix.com/login");
         System.out.println( driver.getTitle());
         System.out.println(driver.getCurrentUrl());
        // System.out.println(driver.getPageSource());
         driver.findElement(By.id(":r3:")).sendKeys("vvk");
         //driver.navigate().to("https://www.facebook.com/login/");
         driver.manage().window().fullscreen();
								//.maximize
								//.minimize
         driver.navigate().to("https://www.facebook.com/login/");
         driver.navigate().refresh();
         driver.navigate().back();
        // driver.navigate().forward();
         driver.findElement(By.id(":r3:")).sendKeys("vvk");
        // driver.manage().window().minimize();
	}

}
