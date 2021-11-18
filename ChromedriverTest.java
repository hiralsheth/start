package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromedriverTest {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=ca");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//Locate elements by ID
			driver.findElement(By.id("username")).sendKeys("xyz");		
			//driver.findElement(By.id("password")).sendKeys("xyzpassword");
			//driver.findElement(By.id("Login")).click();
			//driver.close();
			//Locate elements by Name
			//driver.findElement(By.name("username")).sendKeys("abc");
			//driver.findElement(By.name("pw")).sendKeys("pwabc");
			//driver.findElement(By.name("Login")).click();
			//driver.findElement(By.id("forgot_password_link")).click();
			driver.findElement(By.linkText("Forgot Your Password?")).click();
		}

}

