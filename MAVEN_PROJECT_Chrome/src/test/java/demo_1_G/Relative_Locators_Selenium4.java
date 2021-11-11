package demo_1_G;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
public class Relative_Locators_Selenium4 
{
	/*
	 * Selenium 4 brings Relative Locators which are previously called as Friendly Locators. 
	 * This functionality was added to help you locate elements that are nearby other elements. 
	 * The Available Relative Locators are:
		above
		below
		toLeftOf
		toRightOf
		near
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationbookstore.dev");
		driver.manage().window().maximize();
		
		WebElement advanceseleniuminjava = driver.findElement(By.id("pid6_thumb"));
		WebElement javafortesters = driver.findElement(with(By.tagName("li")).toLeftOf(advanceseleniuminjava));
		javafortesters.click();
		Thread.sleep(2000);
		
		WebElement thecucumberforjavabook = driver.findElement(with(By.tagName("li")).toRightOf(advanceseleniuminjava));
		thecucumberforjavabook.click();
		Thread.sleep(2000);
		
		WebElement experienceoftestautomation= driver.findElement(with(By.tagName("li")).above(advanceseleniuminjava));
		experienceoftestautomation.click();
		Thread.sleep(2000);
	}
}
//((WebElement) ((RelativeBy) driver.findElement(with(By.id("pid6_thumb")))).toLeftOf(By.id("pid5_title"))).click();
