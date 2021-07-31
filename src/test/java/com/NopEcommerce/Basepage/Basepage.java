package com.NopEcommerce.Basepage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.NopEcommerce.Utility.Reading_properties;

public class Basepage {
	
       static Reading_properties R;
	
           public static WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br)
	{
		R=new Reading_properties();
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",R.GetchromeBrowser());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",R.GetfirefoxBrowser());
			driver=new FirefoxDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver",R.GetEdegeBrowser());
			driver=new EdgeDriver();
		}
		driver.get(R.GetapplicationURL());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
		
	
	
	
	
	
	

}
