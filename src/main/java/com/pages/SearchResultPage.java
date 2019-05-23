package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.BaseTest;

public class SearchResultPage extends BaseTest{
	
	List<WebElement> prices= driver.findElements(By.xpath("//*[@class='listing-results-price text-price']"));
	
	
	public void printPropertyPrice() {
		
		for(WebElement ele: prices) {
			System.out.println(ele.toString());
		}
	}
	

}
