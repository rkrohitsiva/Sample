package kirthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo{
//Soft Assert
	@Test
	
	private void tc1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualURL = driver.getCurrentUrl();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualURL, "https://www.facebook.co/", "Title Mismathed");
		System.out.println("Face Book page launched");
		s.assertAll();
		
	}
		@Test
		private void tc2() {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(actualURL, "https://www.google.com/");
			System.out.println("Google page launched");
					
		}
  	
	}


	


