package com.demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Mini_Project {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[contains(text(),'Sign In ')]")).click();
		driver.findElement(By.id("email")).sendKeys("jayavivek212@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Jayavivek212@");
		driver.findElement(By.name("send")).click();
		Actions action = new Actions(driver);
		WebElement element1 = driver.findElement(By.linkText("Men"));
		action.moveToElement(element1).build().perform();
		WebElement element2 = driver.findElement(By.linkText("Tops"));
		action.moveToElement(element2).build().perform();
		WebElement element3 = driver.findElement(By.linkText("Hoodies & Sweatshirts"));
		action.click(element3).build().perform();
		
		driver.findElement(By.id("sorter")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
        driver.findElement(By.xpath("(//div[@class=\"filter-options-title\"])[6]")).click();
        driver.findElement(By.xpath("(//*[@class='item'])[14]")).click();
        
        WebElement element4 = driver.findElement(By.xpath("//*[@class='product-image-photo']"));
		action.contextClick(element4).build().perform();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> windows = driver.getWindowHandles();	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		for (String child : windows) {
			if(!parentWindow.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
			}
		}
		
		driver.findElement(By.xpath("(//*[@class='swatch-option text'])[3]")).click();
		driver.findElement(By.xpath("(//*[@class='swatch-option color'])[3]")).click();
		WebElement quantity = driver.findElement(By.id("qty"));
		quantity.clear();
		quantity.sendKeys("4");
		driver.findElement(By.id("product-addtocart-button")).click();
		
		Set<String> tabs = driver.getWindowHandles();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.linkText("Clear All")).click();
		
		driver.findElement(By.className("product-image-photo")).click();
		driver.findElement(By.xpath("(//*[@class='swatch-option text'])[4]")).click();
		driver.findElement(By.xpath("//*[@aria-label='Red']")).click();
		driver.findElement(By.xpath("//*[@title='Add to Cart']")).click();
		
		driver.findElement(By.xpath("//*[@class='action showcart']")).click();
		driver.findElement(By.linkText("View and Edit Cart")).click();
		
		List<WebElement> quantity1 = driver.findElements(By.xpath("//*[@data-role='cart-item-qty']"));
		for(WebElement cartQuantity : quantity1) {
		  cartQuantity.clear();
		  cartQuantity.sendKeys("2");
		}
		driver.findElement(By.xpath("//*[@title='Update Shopping Cart']")).click();
		driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@data-role='proceed-to-checkout']")).click();
        
        driver.findElement(By.xpath("//*[@name='street[0]']")).sendKeys("abc");
        driver.findElement(By.xpath("//*[@name='city']")).sendKeys("def");
        WebElement element5 = driver.findElement(By.xpath("//*[@name='region_id']"));
        Select select = new Select(element5);
	    select.selectByIndex(2);
	    driver.findElement(By.xpath("//*[@name='postcode']")).sendKeys("12345");
	    driver.findElement(By.xpath("//*[@name='telephone']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//*[@value='tablerate_bestway']")).click();
	    driver.findElement(By.xpath("//*[@class='button action continue primary']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@title='Place Order']")).click();
	    
	    
	}

}
