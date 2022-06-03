package com.mindtree.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
    WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
