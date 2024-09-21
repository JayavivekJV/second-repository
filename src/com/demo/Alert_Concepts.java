package com.demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concepts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://letcode.in/alert");
                //SIMPLE
        WebElement element = driver.findElement(By.id("accept"));
        element.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
                //CONFIRM
        WebElement element1 = driver.findElement(By.id("confirm"));
        element1.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
                //PROMPT
        WebElement element2 = driver.findElement(By.id("prompt"));
        element2.click();
       Alert alert1 = driver.switchTo().alert();
       alert1.sendKeys("VIVEK");
       alert1.accept();
        
	}

}
