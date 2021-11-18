package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam_form {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hiral\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Student Registration Form
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		// Enter FirstName
		driver.findElement(By.id("firstName")).sendKeys("Hiral");
		//Enter LastName
		driver.findElement(By.id("lastName")).sendKeys("Sheth");
		//Enter E-mail
		driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
		Thread.sleep(1000);
		//Gender Radio Button-2
		WebElement RadioGender = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		RadioGender.click();
		System.out.println("Female Radio Button is selected ");
		Thread.sleep(1000);
		
		//MobileNumber
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("1234566789");
		
		//DateOFBirth
		
		 WebElement dateBox = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		 dateBox.sendKeys("09-27-2021");
		 dateBox.sendKeys(Keys.TAB);
		 
		 
		//Subject
		driver.findElement(By.id("subjectsInput")).sendKeys("Maths");
		driver.findElement(By.name("Maths")).click();
		
		
		//checkbox
		
		WebElement MusicCheckBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		//MusicCheckBox.click();
		boolean isSelected = MusicCheckBox.isSelected();
		
		
		if (MusicCheckBox.isSelected())
        {
			System.out.println("Music is selected ");
        }
        else
        {
        	System.out.println("Not selected");
        }
		
		//UploadPicture
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\hiral\\Pictures\\Screenshots\\bird.png");
		
		//Adress
		driver.findElement(By.id("currentAddress")).sendKeys("Cegep de la gaspe et des lies");
		Thread.sleep(5000);
		//dropdown State Selection
		//WebElement selectfirstELe= driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
		//Select sel = new Select(selectfirstELe);
		//sel.selectByValue("NCR");
		
		//dropdown city selection
		//WebElement selectCity = driver.findElement(By.xpath("//div[contains(text(),'Select City')]"));
		//Select selCity = new Select(selectCity);
		//selCity.selectByIndex(1);
		
		//submit button
		//driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		//driver.close();
	}

}
