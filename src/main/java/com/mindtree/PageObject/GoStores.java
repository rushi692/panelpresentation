package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoStores 
{
	 WebDriver ldriver;
		
	 public GoStores(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\'header\']/section/div/ul[2]/li[1]/a")
	 @CacheLookup
	 WebElement clkstore;
	 
	 public void clkStore()
	 {
		 ldriver.manage().window().maximize();
		 clkstore.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	
	 @FindBy(xpath="//*[@id='app-container']/div/main/section[2]/div/a[4]/div[2]/button")
	 @CacheLookup
	 WebElement selectstore;
	 
	 public void selectStore()
	 {
		 selectstore.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 
	 @FindBy(xpath="//*[@id=\'store-details\']/div[4]/div[1]/div[5]/a")
	 @CacheLookup
	 WebElement viewdetail;
	 
	 public void viewDetail()
	 {
		 viewdetail.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
}
