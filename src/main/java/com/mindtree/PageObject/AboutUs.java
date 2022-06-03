package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutUs 
{
	    WebDriver ldriver;
		
		public AboutUs(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\'footer-links\']/div[1]/div[1]/ul[1]/li[1]/a")
		@CacheLookup
		WebElement clkaboutus;
		
		public void scrollAboutUs()
		{
			
			ldriver.manage().window().maximize();
			clkaboutus.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@FindBy(xpath="//*[@id=\'page_content\']/div[1]/div/p[1]")
		@CacheLookup
		WebElement checktext;
		
		public void checkText()
		{
			String text=checktext.getText();
			
			if(text.contains("About Us"))
			{
				System.out.println("About Us find suuccfully");
			}
			else
			{
				System.out.println("Finding page Failed");
			}
			
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		
}
