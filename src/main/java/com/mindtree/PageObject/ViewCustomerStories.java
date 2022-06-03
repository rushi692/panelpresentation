package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCustomerStories 
{
	  WebDriver ldriver;
		
	  public ViewCustomerStories(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}		
	  
	  @FindBy(xpath="//*[@id=\'home\']/div[1]/div[4]/div[4]/div[3]/a")
	  @CacheLookup
	  WebElement clkcustomerstories;
	  
	  public void clkCustomerStories()
	  {
		  ldriver.manage().window().maximize();
		  clkcustomerstories.click();
		  ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	  
	  @FindBy(xpath="//*[@id=\'testicontainer\']/div[2]/div[2]")
	  @CacheLookup
	  WebElement getstories;
	  
	  public void getStories()
	  {
		  String str=getstories.getText();
		  System.out.println(str);
	  }
	  

}
