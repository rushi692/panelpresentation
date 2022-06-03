package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.SelectForCouples;

public class TC_SelectForCouples extends BaseClass 
{
	@Test
	public void selectforcouples()
	{
		SelectForCouples sfc=new SelectForCouples(driver);
		log.info("home page open successfully");
		
		sfc.clkCouples();
		log.info("click on couples successfully");
		
		sfc.selectBed();
		log.info("select bed successfully");
	
	}

}
