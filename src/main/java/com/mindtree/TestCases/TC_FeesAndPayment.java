package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.FeesAndPayment;

public class TC_FeesAndPayment extends BaseClass
{
	@Test
	public void aboutUs()
	{
		FeesAndPayment fap=new FeesAndPayment(driver);
		log.info("home page open successfully");
		
		fap.clkFeesAndPay();
		log.info("click on fees and payment successfully");
		
		fap.checkText();
		log.info("page found successfully");

	}

}
