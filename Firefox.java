package testing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hiral\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement((By.xpath("//div[@id='gf-BIG']")));
	    System.out.println(footerdriver.findElements(By.tagName("a")).size());
	     
	    WebElement columndriver = footerdriver.findElement((By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]")));
	    List<WebElement> columns = columndriver.findElements(By.tagName("a"));
	    int colSize = columns.size();
	    System.out.println(colSize);
	    //System.out.println(columndriver.findElements(By.tagName("a")).size());
	    
	 
	    for(int i=1; i<colSize; i++)
	    {
	    	String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
	    	Thread.sleep(3000);
	    }
	    
	    Set<String> abc= driver.getWindowHandles();//4
	    Iterator<String> it = abc.iterator();
	     
	     while (it.hasNext())
	     {
	    	 driver.switchTo().window(it.next());
	    	 System.out.println(driver.getTitle());
	     }
		driver.close();
		

	}

}
