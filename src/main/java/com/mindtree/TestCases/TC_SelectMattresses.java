package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.SelectMattresses;

public class TC_SelectMattresses extends BaseClass 
{
	@Test
	public void selectmattresses()
	{
		SelectMattresses sm=new SelectMattresses(driver);
		log.info("home page open successfully");
		
		sm.clkMattresses();
		log.info("click on mattresses successfully");
		
		sm.selectQueenSize();
		log.info("select queen size mattresses successfully");
		
		sm.selectCloudPocketSpringMattresses();
		log.info("select aer size mattresses successfully");
		
	}

}
