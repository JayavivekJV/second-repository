package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Concept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		element.click();
		WebElement element1 = driver.findElement(By.xpath("//*[@name='birthday_day']"));
		element1.click();
		               //SINGLE DROPDOWN
		Select select = new Select(element1);
	    select.selectByIndex(2);
		Thread.sleep(3000);
		select.selectByValue("20");
		Thread.sleep(3000);
		              //MULTIPLE DROPDOWN
		driver.navigate().to("https://omayo.blogspot.com/");
		WebElement element3 = driver.findElement(By.xpath("//Select[@id='multiselect1']"));
		element3.click();
		Select multi = new Select(element3);
		multi.selectByIndex(0);
		multi.selectByVisibleText("Swift");
		multi.selectByIndex(3);
		
		
	}

}
