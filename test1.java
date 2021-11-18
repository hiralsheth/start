package testing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		driver.manage().window().maximize();
		driver.findElement(By.id("nav-link-accountList")).click();
		boolean eleselected = driver.findElement(By.id("createAccountSubmit")).isDisplayed();
		System.out.println("Create Account button is displayed " +eleselected);
		Thread.sleep(1000);
		driver.close();
	}

}
