package com.testcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseOne {

	// HomePage homePage = new HomePage();
	// BaseTest baseTest = new BaseTest();
	public WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\automationtesting\\Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zoopla.co.uk/");
	}

	@Test
	public void test1() {
		searchLoc();
		printPropertyPrice();
	}

	public void searchLoc() {
		WebElement locationBox = driver.findElement(By.id("search-input-location"));
		WebElement searchButton = driver.findElement(By.id("search-submit"));
		locationBox.sendKeys("London");
		searchButton.click();
	}

	public void printPropertyPrice() {
		List<WebElement> prices = driver.findElements(By.xpath("//*[@class='listing-results-price text-price']"));
		for (WebElement ele : prices) {
			System.out.println(ele.getText());
		}
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
