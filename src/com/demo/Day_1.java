package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement element=driver.findElement(By.name("email"));
		element.sendKeys("Jayavivek");
	    WebElement element1=driver.findElement(By.name("pass"));
    	element1.sendKeys("856214796");
    	
    	WebElement element2=driver.findElement(By.id("loginbutton"));
    	Boolean Display=element2.isDisplayed();
    	System.out.println(Display);
    	Boolean enable=element2.isEnabled();
    	System.out.println(enable);
    	Boolean select=element2.isSelected();
    	System.out.println(select);
    	
	}

}
