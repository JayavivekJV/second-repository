package com.demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
	       WebDriver driver=new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	       WebElement element=driver.findElement(By.xpath("//*[@name='email']"));
	       element.click();
	       TakesScreenshot shot=(TakesScreenshot) driver;
	       File source=shot.getScreenshotAs(OutputType.FILE);
	       File Destination=new File("C:\\Users\\jayav\\eclipse-workspace\\Selenium_Concept\\Screenshot\\page.png");
	       FileHandler.copy(source, Destination);
	       
	       }

}
