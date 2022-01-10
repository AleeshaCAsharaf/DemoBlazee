package com.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POM.base.BaseClass;


public class ProductPage extends BaseClass {
	@FindBy(xpath="//a[@href='prod.html?idp_=8']//img[@class='card-img-top img-fluid']")
	WebElement product;
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public ProductDisplayPage clickOnProduct() {
		product.click();
		return new ProductDisplayPage();
	}
}

