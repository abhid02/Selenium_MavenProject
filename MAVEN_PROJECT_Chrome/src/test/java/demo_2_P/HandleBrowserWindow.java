package demo_2_P;

import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleBrowserWindow 

{
	public static void main(String[] args) 
	
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		/*
		 * getWindowHandle()-return ID of single browser window
		 * and every time this ID will be different
		 * ID of current window is CDwindow-3EB1347CAB190A742CC0FB2EF922ECF7
		 * CDwindow-9DA3DC8BEC7E0FB39DDE1E103D91E635
		 */
		
		//String WindowID=driver.getWindowHandle();
		//System.out.println(WindowID);
		
		/*
		 * getWindowHandles()-return IDs of multiple browser windows
		 * [CDwindow-41BAF9D5BB7E60094ADFC8B2A9DE7CA3, 
		 * CDwindow-350AE2174C831A65ECD22677E65B3A13]
		 */
		
		driver.findElement(By.xpath("//a[@target=\"_blank\"]")).click();
		Set<String> WindowIDs=driver.getWindowHandles();
		System.out.println(WindowIDs);
		
//First Method -iterator()
		
		/*Iterator<String> it=WindowIDs.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		System.out.println("Parent Window ID: "+ parentId);
		System.out.println("Child window ID: "+childId);*/
		
//Second Method- List or ArrayList
		
		//Converting Set to List
		
		List <String> WindowIDsList = new ArrayList<String>(WindowIDs);
		
		String ParentID=WindowIDsList.get(0);
		String ChildID=WindowIDsList.get(1);
		
		System.out.println("Parent Window ID: "+ ParentID);
		System.out.println("Child window ID: "+ChildID);
		
// How to use window ID for switching
		
		/*driver.switchTo().window(ParentID);
		System.out.println("Parent window Title:"+ driver.getTitle());
		
		driver.switchTo().window(ChildID);
		System.out.println("Child window Title:"+ driver.getTitle());*/
		
//For Each Loop
		
		/*for(String winid:WindowIDsList)
		{
			//System.out.println(winid);
			String Title=driver.switchTo().window(winid).getTitle();
			System.out.println(Title);
		}*/

//Difference between close() and quit()
		
		//driver.close(); //Close the current window, quitting the browser if it's the last window currently open
		//driver.quit(); //Quits this driver, closing every associated window.

//close() and quit using if else condition
		
		for(String winid:WindowIDsList)
		{
			//System.out.println(winid);
			String Title=driver.switchTo().window(winid).getTitle();
			if(Title.equals("OrangeHRM HR Software | Free HR Software | HRMS | HRIS"))
			
//inside if condition we can multiple Title.equals("another title") using OR(||)
			{
				driver.close();
			}
		}		
	}
}
