package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.ViewCustomerStories;

public class TC_ViewCustomerStories extends BaseClass 
{
	@Test
	public void viewcusstories()
	{
		ViewCustomerStories vcs=new ViewCustomerStories(driver);
		log.info("home page open successfully");
		
		vcs.clkCustomerStories();
		log.info("click on customer stories successfully");
		
		vcs.getStories();
		log.info("stories found successfully");
	}

}
