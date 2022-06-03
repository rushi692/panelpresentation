package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCard 
{
	WebDriver ldriver;
	
	 public GiftCard(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\'header\']/section/div/ul[2]/li[3]/a")
	 @CacheLookup
	 WebElement clkgiftcard;
	 
	 public void clkGiftCard()
	 {
		 ldriver.manage().window().maximize();
		 clkgiftcard.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 @FindBy(className="_2ebST")
	 @CacheLookup
	 WebElement selectgiftcard;
	 
	 public void selectGiftCard()
	 {
		 selectgiftcard.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 @FindBy(xpath="//*[@id=\'app-container\']/div/main/section/section[2]/div/section[2]/div[1]/button[1]")
	 @CacheLookup
	 WebElement selectamount;
	 
	 public void selectAmount()
	 {
		 selectamount.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 
	 @FindBy(xpath="//*[@id='app-container']/div/main/section/section[2]/div/section[2]/button")
	 @CacheLookup
	 WebElement selectnext;
	 
	 public void selectNext()
	 {
		 selectnext.click();
		 ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }

}
