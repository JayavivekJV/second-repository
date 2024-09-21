package com.demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element=driver.findElement(By.name("username"));
		element.sendKeys("Jayavivek");
	    WebElement element1=driver.findElement(By.name("password"));
    	element1.sendKeys("856214796");
    	WebElement forgetpassword=driver.findElement(By.partialLinkText("pass"));
    	String Text=forgetpassword.getText();
    	System.out.println(Text);
        List<WebElement> Elements=driver.findElements(By.tagName("a"));
        for(WebElement e:Elements) {
        	String elementNames=e.getText();
        	System.out.println(elementNames);
        }
	}

}
