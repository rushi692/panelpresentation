package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.GiftCard;

public class TC_GiftCard extends BaseClass
{
	@Test
	public void giftCard()
	{
		GiftCard gc=new GiftCard(driver);
		log.info("home page open successfully");
		
		gc.clkGiftCard();
		log.info("click on gift card successfully");
		
		gc.selectGiftCard();
		log.info("select gift card successfully");
		
		gc.selectAmount();
		log.info("select amount successfully");
		
		gc.selectNext();
		log.info("click on next button successfully");
	}
	
	
}