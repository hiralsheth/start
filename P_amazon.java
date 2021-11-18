package testing;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.tools.javac.util.Assert;

public class P_amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.ca/");
		driver.findElement(By.id("nav-link-accountList")).click();
		boolean display = driver.findElement(By.id("ap_email")).isDisplayed();
		Assert.assertTrue(display);
		driver.navigate().back();
		driver.get("https://www.amazon.ca/");
		driver.close();
		
		
		System.out.println("Element is Displayed :" +display);

	}

}
