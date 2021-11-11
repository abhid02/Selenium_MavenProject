package demo_1_G;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_11_Nov 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.get("https://selenium.dev");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = driver;

// Scroll Down or Up on Browser window
		
		js.executeScript("window.scrollBy(0,550)", "");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(0,-550)", "");
		Thread.sleep(10000);

// Scroll Right or Left on Browser window
		
		driver.get("https://www.album.alexflueras.ro/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(1000,0)", "");
		Thread.sleep(10000);
		js.executeScript("window.scrollBy(-1000,0)", "");
		
// to input text into a text box without using sendKeys() method

//Method 1
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		js.executeScript("document.getElementById('email').value='abhigd1111'");
		
//Method 2
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement (By.name ("username"));
		js.executeScript("arguments[0].value='timepass@gmail.com'",email);
		Thread.sleep(3000);
		
		WebElement checkbox=driver.findElement (By.xpath("//input[@id='persistent']"));
		js.executeScript("arguments[0].click()", checkbox);
		
		
		 /*https://www.selenium.dev/documentation/webdriver/browser_manipulation/
		  * Reference Programming from above link
		 
		 //Creating the JavascriptExecutor interface object by Type casting
	      JavascriptExecutor js = (JavascriptExecutor)driver;
	      
	    //Button Element
	      WebElement button =driver.findElement(By.name("btnLogin"));
	      
	    //Executing JavaScript to click on element
	      js.executeScript("arguments[0].click();", button);
	      
	    //Get return value from script
	      String text = (String) js.executeScript("return arguments[0].innerText", button);
	    
	    //Executing JavaScript directly
	      js.executeScript("console.log('hello world')");
	      
	      */
	}

}
