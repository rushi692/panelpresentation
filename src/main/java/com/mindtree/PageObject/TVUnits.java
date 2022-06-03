package com.mindtree.PageObject;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVUnits 
{
	    WebDriver ldriver;
		
		public TVUnits(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\'content\']/div[3]/div/div[2]/a[4]")
		@CacheLookup
		WebElement clktvunits;
		
		public void clkTVUnits()
		{
			ldriver.manage().window().maximize();
			clktvunits.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@FindBy(xpath="//*[@id=\'content\']/div[3]/div/ul/li[2]/div/a/img")
		@CacheLookup
		WebElement  selecttv;
		
		public void selectTV()
		{
			selecttv.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
}     

