package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.name("username"));
		element.sendKeys("Jayavivek");
	    WebElement element1=driver.findElement(By.name("password"));
    	element1.sendKeys("856214796");
    	WebElement element2=driver.findElement(By.id("login"));
    	Boolean Display=element2.isDisplayed();
    	System.out.println(Display);
    	Boolean select=element2.isSelected();
    	System.out.println(select);
    	Boolean enable=element2.isEnabled();
    	System.out.println(enable);

	}

}
