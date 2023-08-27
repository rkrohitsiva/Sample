package Package;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listweb {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchtextbox.sendKeys("iphone 14");
	    
	    Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(30000);
		WebElement iphone = driver.findElement(By.xpath("//[text()='Apple iPhone 14 (128 GB) - Blue']"));
		iphone.click();
		
		
		WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
		
		addtocart.click();
		
				
		// TODO Auto-generated method stub

	}
	

}

//@BeforeClass
//private void beforeClass() {
//	 System.out.println("Beforeclass");
//}
//
//@AfterMethod
//private void afterMethod() {
//	 System.out.println("AfterMethod");
//}
//@AfterClass
//private void afterClass() {
//	 System.out.println("afterClass");
//}
//
//@BeforeMethod
//private void beforeMethod() {
//	 System.out.println("beforeclass");
