package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseTest;

public class HomePage extends BaseTest {

	WebElement locationBox = driver.findElement(By.id("search-input-location"));
	WebElement searchButton = driver.findElement(By.id("search-submit"));
	
	public HomePage() {
		super();
	}
	
	public void searchLoc() {
		locationBox.sendKeys("London");
		searchButton.click();
	}
	
}
