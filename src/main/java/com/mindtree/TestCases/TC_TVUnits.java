package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.TVUnits;

public class TC_TVUnits extends BaseClass 
{
	@Test
	public void tvUnits()
	{
		TVUnits tv=new TVUnits(driver);
		log.info("home page open successfully");
		
		tv.clkTVUnits();
		log.info("click on tv units successfully");
		
		tv.selectTV();
		log.info("select tv successfully");
		
	}
	

}
