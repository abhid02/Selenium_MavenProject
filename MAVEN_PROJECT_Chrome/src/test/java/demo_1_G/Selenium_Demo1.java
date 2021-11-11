package demo_1_G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in");
		driver.manage().window().maximize();
		
		
		
		driver.findElement(By.xpath("(//a[@class=\"font14 dropdown-toggle\"])[2]")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id(null)).click();
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[24]")).sendKeys("Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.id("dphh1")).click();
		driver.findElement(By.xpath("//body[1]/div[15]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")).click();
		
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("abhigd1991");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123456789");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		
		driver.get("https://www.mercurytravels.co.in");
		driver.findElement(By.linkText("Indian Holidays")).click();
		
		Thread.sleep(2000);
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.tagName("input")).sendKeys("Locators");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(2000);
		
		
		driver.get("https://www.mercurytravels.co.in");
		driver.findElement(By.xpath("//select[@name=\"nights\"]/parent::div[@class=\"controls\"]")).click();
		
		Thread.sleep(2000);
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		//driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("Abhijeet");
		driver.findElement(By.name("lastname")).sendKeys("Dhumal");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.xpath("//input[@id='exp-3']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("1.1.1111");
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.xpath("//select[@id='selenium_commands']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		

}

}
