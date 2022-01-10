package com.POM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.base.BaseClass;


import com.POM.pages.ProductPage;

public class HomePageTest extends BaseClass {
	
	
	ProductPage productPage;
	
	@Test
	public void homePageTest() {
		productPage = homePage.products();
		String expectedURL ="https://www.demoblaze.com/#";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
		
	}

}

