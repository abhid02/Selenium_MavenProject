package demo_1_G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_09_Nov 

{
	public static void main(String[] args) 
	
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		/*driver.get("https://www.mercurytravels.co.in/");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String src=driver.getPageSource();
		System.out.println(src);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		/*
		 * How to check WebElement is Displayed, Enabled, Selected
		 * Methods are Conditional methods or commands
		 * isDisplayed():-Check element is present on WebPage
		 * isEnabled()
		 * isSelected():- Used for elements like Radio Buttons, Checkboxes
		 */
		
		/*driver.get("http://demo.automationtesting.in/Register.html");
		WebElement disp=driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		System.out.println(disp.isDisplayed());
		
		WebElement enb=driver.findElement(By.id("msdd"));
		System.out.println(enb.isEnabled());
		
		WebElement sel=driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		System.out.println(sel.isSelected());*/
		
		/*
		 * Difference between get() & navigate()
		 * get() is used to navigate particular url(website) and wait till page load
		 * navigate().to() is used to navigate to particular url and does not wait to page load 
		 * it maintains browser history or cookies to navigate back or forward
		 */
		
		/*driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		/* Use of if else*/
		
		driver.get("https://www.snapdeal.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase(title))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
