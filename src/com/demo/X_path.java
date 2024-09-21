package com.demo;

import java.util.List;


//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.amazon.in/");
         List<WebElement>elementName=driver.findElements(By.className("nav-a"));
         for(WebElement elements:elementName) {
        	 System.out.println(elements.getText());
         }
         WebElement element=driver.findElement(By.xpath("//*[@data-csa-c-content-id=\"nav_cs_electronics\"]"));
         System.out.println(element.getText());
         WebElement element1=driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_4']"));
         String s2=element1.getText();
         System.out.println(s2);
         WebElement element2=driver.findElement(By.xpath("//a[contains(text(),'Fashion')]"));
         String s3=element2.getText();
         System.out.println(s3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
