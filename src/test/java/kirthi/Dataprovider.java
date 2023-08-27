package kirthi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dataprovider {
	@Test(dataProvider = "login")
	
	private void tc1(String s1, String s2) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("emial")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		}
	
	@Dataprovider(name="login")
	public Object[][] loginData(){
		
		Ob
	}
		
	}
