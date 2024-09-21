package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Interface.PageElements;

public class FacebookLoginPOM implements PageElements{
static WebDriver driver;   // chrome  // facebookLoginPOM
	
	//parameterized constructor
	public FacebookLoginPOM(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	//WebElements stored in private variable
	@FindBy(name=email_id)
	private WebElement email;
	
	@FindBy(name=password_)
	private WebElement password;
	
	@FindBy(name=login_button)
	private WebElement login;
	
	@FindBy(xpath = "//a[text()='Forgotten password?']")
	private WebElement forgetpasswprd;
	
	@FindBy(xpath = "//*[@id='u_0_0_1P']")
	private WebElement CreateNewAcnt;
    //using getter method we can call the method
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgetpasswprd() {
		return forgetpasswprd;
	}

	public WebElement getCreateNewAcnt() {
		return CreateNewAcnt;
	}
		
		
		
		
	



}
