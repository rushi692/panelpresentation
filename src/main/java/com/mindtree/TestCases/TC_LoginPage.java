package com.mindtree.TestCases;

import org.testng.annotations.Test;

import com.mindtree.PageObject.LoginPage;

public class TC_LoginPage extends BaseClass
{
	@Test
	public void loginpage() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		log.info("Home page open successfully");
		
		lp.loginHover();
		log.info("Login window hover successfully");
		
		lp.loginClk();
		log.info("click on login btn successfully");
		
		lp.popUpWindow();
		log.info("go to pop up window successfully");
		
		Thread.sleep(5000);
		lp.textEmail();
		log.info("email send successfully");
		
		lp.textPassword();
		log.info("password send successfully");
		
		lp.clickLogin();
		log.info("login successfully");
		
	}
	

}
