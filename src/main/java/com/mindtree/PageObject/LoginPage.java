package com.mindtree.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
    WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]/span/svg")
	@CacheLookup
	WebElement loginhover;
	
	@FindBy(xpath="//*[@id=\'header\']/div[1]/div/section[3]/ul/li[2]")
	@CacheLookup
	WebElement loginclk;
	
	public void loginHover()
	{
		ldriver.manage().window().maximize();
		Actions action=new Actions(ldriver);
		action.moveToElement(loginhover);
	}
	
	public void loginClk()
	{
		loginclk.click();
	}	
	
	@FindBy(xpath="//a[@class='login-link authentication_popup']")
	@CacheLookup
	WebElement popupwindow;
	
	public void popUpWindow()
	{
		popupwindow.click();
	}
	
	@FindBy(xpath=("(//input[@id='spree_user_email'])[2]"))
	@CacheLookup
	WebElement textemail;
	
	public void textEmail()
	{
		textemail.click();
		textemail.sendKeys("Rushi@123");
	}
	
	@FindBy(xpath=("(//input[@id='spree_user_password'])[3]"))
	@CacheLookup
	WebElement textpassword;
	
	public void textPassword()
	{
		textpassword.click();
		textpassword.sendKeys("Rushi123");
	}
	
	@FindBy(xpath=("(//input[@id='ul_site_login'])"))
	@CacheLookup
	WebElement clicklogin;
	
	public void clickLogin()
	{
		clicklogin.click();	
	}
	
}
