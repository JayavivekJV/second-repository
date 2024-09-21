package com.demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames_concept {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		driver.findElement(By.name("email")).sendKeys("vvk123@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("JAYAVIVEK");
		
		TakesScreenshot shot=(TakesScreenshot) driver;
	    File source=shot.getScreenshotAs(OutputType.FILE);
	    File Destination=new File("C:\\Users\\jayav\\eclipse-workspace\\Selenium_Concept\\Screenshot\\frames.png");
	    FileHandler.copy(source, Destination);

	}

}
