package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.AboutUs;

public class TC_AboutUs extends BaseClass
{
	@Test
	public void aboutUs()
	{
		AboutUs au=new AboutUs(driver);
		log.info("home page open successfully");
		
		au.scrollAboutUs();
		log.info("scroll down successfully");
		
		au.checkText();
		log.info("page found successfully");

	}
	

}
