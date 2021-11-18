package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

//import com.sun.tools.javac.util.Assert;

public class FirstScript {
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.ca/");
			driver.manage().window().maximize();
			driver.findElement(By.id("nav-link-accountList")).click();
			boolean eleselected = driver.findElement(By.id("createAccountSubmit")).isDisplayed();
			System.out.println("Create Account button is displayed " +eleselected);
			Thread.sleep(1000);
			driver.close();
			Assert.assertTrue(eleselected);
			/*
			 * if(at.equalsIgnoreCase(et)) { System.out.println("done!!!!!!!"); } else {
			 * System.out.println("not done!!!!!!!"); }
			 */
			
			
			
		}

}
