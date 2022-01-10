package com.POM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.POM.base.BaseClass;



public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@class='list-group']//a[text()='Laptops']")
	WebElement category;
	
public HomePage() {
	PageFactory.initElements(driver, this);
	
}
public ProductPage products() {
	category.click();
	return new ProductPage();
}

}
