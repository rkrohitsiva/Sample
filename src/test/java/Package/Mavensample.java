package Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavensample {

	public static void main(String[] args) throws InterruptedException {


		//System.setProperty("webdriver.chrome.driver", "./externalJars/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[text()='Create new account']")).click();
		
		Thread.sleep(50000);
		//drop down locator
//		WebElement day = driver.findElement(By.id("day"));
//		Select s = new Select(day);
//		s.selectByIndex(5);
//	
//		
//		
//		WebElement month = driver.findElement(By.id("month"));
//		Select sl = new Select(month);
//		
//		sl.selectByIndex(3);
//		
//		
//		WebElement year = driver.findElement(By.id("year"));
//		Select s2 = new Select(year);
//		s2.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//button[@id='alertButton']"));
		 
		Alert s= driver.switchTo().alert();
		
		s.accept();
		
		
		
		
		
		
		

		
		
		
		}

}
