package com.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POM.base.BaseClass;


public class ProductDisplayPage extends BaseClass{
	@FindBy(xpath="//a[@onClick='addToCart(8)']")
	WebElement ProductCart;
	
	public ProductDisplayPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void AddToCart() {
		ProductCart.click();
	}

}
