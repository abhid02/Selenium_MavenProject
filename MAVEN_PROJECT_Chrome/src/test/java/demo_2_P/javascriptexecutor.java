package demo_2_P;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptexecutor 
{

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
// This way also possible
		
		/*ChromeDriver driver=new ChromeDriver();
		JavascriptExecutor js=driver;*/
		
		//js.executeScript(Script, args);
		
		//flash
		// Drawing border & take screenshot
		// Getting title of the page
		//click action
		//Generate alert
		//Refreshing the page
		// Scrolling down page
		// Scroll up page
		// Zoom page
	}

}
