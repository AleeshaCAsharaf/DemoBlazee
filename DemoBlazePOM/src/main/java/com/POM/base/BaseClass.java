package com.POM.base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.POM.pages.HomePage;


public class BaseClass {
	


	public HomePage homePage;	
	public WebDriver driver;
	
	
	@BeforeMethod
	public  void  Setup() {
		System.setProperty("webdriver.chrome.driver", 
			     "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.get("https://www.demoblaze.com/");		
					driver.manage().window().maximize();
					homePage = new HomePage();
					
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	
	}

