package kirthi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

//reusable
public class sampleclass{
	static WebDriver driver;
	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

	//print url
	public static void printUrl() {
		System.out.println(driver.getCurrentUrl());
		
		String title = driver.getTitle();
		System.out.println(title);
	}
}
