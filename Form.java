package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Form {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	    driver.manage().window().maximize();
	        // Enter Firstname
	        driver.findElement(By.name("firstname")).click();
	        driver.findElement(By.name("firstname")).sendKeys("hey");
	        // Set Lastname
	        driver.findElement(By.name("lastname")).click();
	        driver.findElement(By.name("lastname")).sendKeys("HRU");
	        // Select Gender
	        driver.findElement(By.id("sex-0")).click();
	     
	        driver.findElement(By.id("exp-4")).click();
	     
	        //driver.findElement(By.id("datepicker")).click();
	        driver.findElement(By.id("datepicker")).sendKeys("13-10-2021");
	       
	       // for profession
	        WebElement professionCheckbox= driver.findElement(By.xpath("//input[@id='profession-0']"));
	        professionCheckbox.click();   
	        // Select Continent
	     
	        //WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
	        //dropdown1.findElement(By.xpath("//option[contains(text(),'Wait Commands')]")).click();

	        if (professionCheckbox.isSelected())
	        {
	        System.out.println("Selected");
	        }
	        else
	        {
	        System.out.println("Not selected");
	        }
	       
	       
	        //Dropdowns
	        Select dropdown11 = new Select(driver.findElement(By.xpath("//select[@id='continents']")));
	       
	        driver.findElement(By.id("submit")).click();
	        //file upload
	        driver.findElement(By.xpath("//input[@id='photo']")).sendKeys("C:\\Users\\hiral\\Pictures\\Screenshots\\bird.png");
	        
	        
	       }
	}

