package com.mindtree.PageObject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectForCouples 
{
	WebDriver ldriver;
	
	public SelectForCouples(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\'content\']/div[6]/div/div/ul/div/div/ul/li[2]/a/img")
	@CacheLookup
	WebElement clkcouples;
	
	public void clkCouples()
	{
		ldriver.manage().window().maximize();
		clkcouples.click();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@FindBy(xpath="//*[@id=\'content\']/div[3]/div/ul/li[11]/div/a/img")
	@CacheLookup
	WebElement selectbed;
	
	public void selectBed()
	{
		Set <String> s=ldriver.getWindowHandles();
		for(String i:s)
		{
			String t=ldriver.switchTo().window(i).getTitle();
			System.out.println(t);
		}
		
		selectbed.click();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
