package com.mindtree.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile 
{
    Properties prop;
	
	public ReadPropertyFile()
	{
		File src=new File("./testdata/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
				
		} catch (Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	
	}
	
	public String getApplicationURL()
	{
		String url=prop.getProperty("URL");
		return url;
	}
	
	public String getChromePath()
	{
		String chromepath=prop.getProperty("chromepath");
		return chromepath;
	}

}
