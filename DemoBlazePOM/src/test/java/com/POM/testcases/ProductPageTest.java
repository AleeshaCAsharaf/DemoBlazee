package com.POM.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.base.BaseClass;
import com.POM.pages.HomePage;
import com.POM.pages.ProductPage;

public class ProductPageTest extends BaseClass {
	ProductPage productPage;
	HomePage homePage;
	
	@Test
	public void productsResult() {
		productPage = homePage.products();
		productPage.clickOnProduct();
		String expectedURL = "https://www.demoblaze.com/prod.html?idp_=8";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}
