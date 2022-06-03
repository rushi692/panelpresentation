package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.GoStores;

public class TC_GoStores extends BaseClass 
{
	@Test
	public void stores()
	{
	   GoStores gc=new GoStores(driver);
	   log.info("home page open successfully");
	   
	   gc.clkStore();
	   log.info("click store open successfully");
	   
	   gc.selectStore();
	   log.info(" select store open successfully");
	   
	   gc.viewDetail();
	   log.info("view details open successfully");
	   
	   
	}

}
