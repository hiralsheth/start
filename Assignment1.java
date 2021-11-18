package testing;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment1 {
	
		public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.manage().window().maximize();
	        
		
		  driver.findElement(By.xpath("//input[@id='autosuggest']")).click();
		  driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("India");
		  //click multicity
		  //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']")).click(); 
		  //alert
		 // driver.findElement(By.xpath("//*[@id=\"MultiCityModelAlert\"]")).click();
		 // Thread.sleep(3000);
		  //click round trip
		  //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click(); 
		  //Thread.sleep(3000); 
		  //Student check box select 
		  WebElement Checkbox=driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']"));
		  Checkbox.click();
		  Thread.sleep(1000);
		  //choose From 
		 WebElement dest = driver.findElement((By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		 dest.sendKeys("goa");
		 // Select sel= new Select(driver.findElement((By.id("ctl00_mainContent_ddl_originStation1_CTXT"))));
		  //sel.selectByValue("AMD");
		 // WebElement first = sel.getFirstSelectedOption();
		  //System.out.println("first element : " +first.getText());
		 
		  //choose To
		  WebElement to = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")); 
		  //Select dropdown2= new Select(to);
		 // dropdown2.selectByVisibleText("Mumbai");
		  to.sendKeys("Mumbai");
		  
		  
		  
		  // Below Date function not working because date field is only read-only.
		 // ((JavascriptExecutor)driver).executeScript("document.getElementById('ctl00_mainContent_view_date1').removeAttribute('readonly',0);");
		  WebElement date1= driver.findElement(By.id("ctl00_mainContent_view_date1"));
		  date1. sendKeys("26-10-2021");
		  Thread.sleep(2000);
		  WebElement date2 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
		  date2.sendKeys("30-10-2021");
		  Thread.sleep(2000);
		  
		  //select people
		  driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); 
		  //select currency
		  driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).click();
		  driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")).sendKeys("USD");
		  Thread.sleep(2000); //click on search button 
		  driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
		  Thread.sleep(2000); 
		  driver.close();
		 
	   /* System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("abc");
		
		//for radio buttons
		WebElement radio1= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
		WebElement radio2= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		WebElement radio3= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_2']"));
		
//		radio3.click();
//		System.out.println("Radio button option 3 selected");
//		System.out.println(radio3.isSelected());
		
		radio2.click();
		System.out.println("Radio button option 2 selected");
		
		radio1.click();
		System.out.println("Radio button option 1 selected");
		
		
		//dropdown from
		Select drpfrom=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")));
		drpfrom.selectByVisibleText("Goa (GOI)");
		
		//dropdown to
		Select drpto=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")));
		drpto.selectByVisibleText("Jaipur (JAI)");
		
		//date
		driver.findElement(By.id("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		//dropdown passengers
		Select drppassengers=new Select(driver.findElement(By.xpath("//div[@id='divpaxinfo']")));
		drppassengers.selectByVisibleText("1 Adult");
		
		//dropdwon currency
		Select drpcurrency=new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		drpcurrency.selectByVisibleText("INR");
		
		//for radio buttons
				WebElement radio4= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_friendsandfamily']"));
				WebElement radio5= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']"));
				WebElement radio6= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']"));
				WebElement radio7= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']"));
				WebElement radio8= driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_Unmr']"));
				
				radio4.click();
				System.out.println("Radio button option 4 selected");
				
				radio5.click();
				System.out.println("Radio button option 5 selected");
				System.out.println(radio2.isSelected());
				
				radio6.click();
				System.out.println("Radio button option 6 selected");
				
				radio7.click();
				System.out.println("Radio button option 7 selected");
				
				radio8.click();
				System.out.println("Radio button option 8 selected");*/
		}
}