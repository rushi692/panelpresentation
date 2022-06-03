package com.mindtree.PageObject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectMattresses 
{
	 WebDriver ldriver;
		
		public SelectMattresses(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(xpath="//*[@id=\'content\']/div[3]/div/div[2]/a[5]")
		@CacheLookup
		WebElement clkmattresses;
		
		public void clkMattresses()
		{
			ldriver.manage().window().maximize();
			clkmattresses.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@FindBy(xpath="//*[@id=\'content\']/div[2]/div[2]/div/div[1]/div/a[1]/img")
		@CacheLookup
		WebElement selectqueensize;
		
		public void selectQueenSize()
		{
			selectqueensize.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@FindBy(xpath="//*[@id=\'content\']/div[3]/div/ul/li[5]/div[1]/a[1]/img")
		@CacheLookup
		WebElement selectcloudpocketspringmattresses;
		
		public void selectCloudPocketSpringMattresses()
		{
			Set <String> s=ldriver.getWindowHandles();
			for(String i:s)
			{
				String t=ldriver.switchTo().window(i).getTitle();
				System.out.println(t);
			}
			selectcloudpocketspringmattresses.click();
			ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

}
