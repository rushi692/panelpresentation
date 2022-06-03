package com.mindtree.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.mindtree.Utilities.ReadPropertyFile;

public class BaseClass 
{

    ReadPropertyFile readfile=new ReadPropertyFile();
	
	public String URL=readfile.getApplicationURL();
	public static WebDriver driver;
	
	public static Logger log;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) 
	{
		log=Logger.getLogger("Navigate to home page");
		PropertyConfigurator.configure("log4j.properties");
		
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",readfile.getChromePath());
			driver=new ChromeDriver();
		}
		driver.get(URL);
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/ScreenShot/"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		
	}

}
