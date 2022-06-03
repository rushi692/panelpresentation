package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeesAndPayment 
{
	 WebDriver ldriver;
		
		public FeesAndPayment(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\'footer-links\']/div[1]/div[2]/ul[1]/li[1]/a")
		@CacheLookup
		WebElement clkfeesandpay;
		
		public void clkFeesAndPay()
		{
			
			ldriver.manage().window().maximize();
			clkfeesandpay.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@FindBy(xpath="//*[@id=\'page_content\']/p[5]/strong")
		@CacheLookup
		WebElement checktext;
		
		public void checkText()
		{
			String text=checktext.getText();
			
			if(text.contains("FEES AND PAYMENT OPTIONS"))
			{
				System.out.println("Fees And Payment find suuccfully");
			}
			else
			{
				System.out.println("Finding page Failed");
			}
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

}
