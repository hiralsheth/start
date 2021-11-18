package testing;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {
	@Test	
	public void test1() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		boolean display = driver.findElement(By.id("createAccountSubmit")).isDisplayed();
		Assert.assertTrue(display);
		System.out.println("Element is Displayed :" +display);
		driver.close();
	}
	@Test
	public void test2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		
		String isdisplayed = driver.findElement(By.xpath("//div[contains(text(),'Enter your e-mail address or mobile phone number')]")).getText();
		//Assert.assertTrue(display);
		Assert.assertEquals("Enter your e-mail address or mobile phone number", isdisplayed);
		driver.close();
		//fail("Not yet implemented");
	}

}
