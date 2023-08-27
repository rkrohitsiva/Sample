package kirthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	@Test
	
	private void tc1() {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualURL = driver.getCurrentUrl();
	Assert.assertEquals(actualURL, "https://www.facebook.com/");
	System.out.println("Face Book Page launched");
}

		@Test
		
		private void tc2() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, "https://www.google.com/");
		System.out.println("Google Book Page launched");
	
}
	}
