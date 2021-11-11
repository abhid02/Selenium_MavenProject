package demo_1_G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors_Demo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize(); // maximize web page

//Tag & ID
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("input#email")).sendKeys("Abhijeet");
		  driver.findElement(By.cssSelector("#email")).sendKeys("Abhijeet");
		  Thread.sleep(2000);
		  
// Tag & Class
		 
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Abhijeet");
		  driver.findElement(By.cssSelector(".inputtext")).sendKeys("Abhijeet");
		  Thread.sleep(2000);
		  
//Tag & attribute
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("[name=email]")).sendKeys("Abhijeet");
		  driver.findElement(By.cssSelector("input[name=email]")).sendKeys("Abhijeet");
		  Thread.sleep(2000);
		  
//Tag , class & attribute
		  
		  driver.get("https://www.facebook.com/");
		  driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("Abhijeet");
		  driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("@#$abc123");

	}

}
