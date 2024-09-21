package com.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Concepts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement table = driver.findElement(By.xpath("//table/thead/th[3]"));
		String head = table.getText();
		System.out.println(head);
		WebElement row1 = driver.findElement(By.xpath("//table/tr[1]/td[3]"));
		String dessert1 = row1.getText();
		System.out.println(dessert1);
		WebElement row2 = driver.findElement(By.xpath("//table/tr[2]/td[3]"));
		String dessert2 = row2.getText();
		System.out.println(dessert2);
		WebElement row3 = driver.findElement(By.xpath("//table/tr[3]/td[3]"));
		String dessert3 = row3.getText();
		System.out.println(dessert3);
		WebElement row4 = driver.findElement(By.xpath("//table/tr[4]/td[3]"));
		String dessert4 = row4.getText();
		System.out.println(dessert4);
		

	}

}
