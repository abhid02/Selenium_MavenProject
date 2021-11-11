package demo_1_G;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_08_Nov {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.mercurytravels.co.in/");

//How to select element from dropdown list
		
		//WebElement Select_Duration=driver.findElement(By.id("duration_d"));
		
		//Select sd=new Select(Select_Duration);
		
		//sd.selectByVisibleText("1Nights+2Days");
		//sd.selectByValue("2Nights / 3Days");
		//sd.selectByIndex(3);
		
// How to print text of particular element of webpage
		
		//String s=driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[7]/a")).getText();	
		//System.out.println(s);

// How to find total number or count of elements on WebPage
		
		int a=driver.findElements(By.tagName("a")).size();
		System.out.println(a);
	}
}

