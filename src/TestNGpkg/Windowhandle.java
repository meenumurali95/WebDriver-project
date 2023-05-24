package TestNGpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
	String parentwindow=driver.getWindowHandle();
	System.out.println("Parent window title="+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	
	Set<String>allwindowhandles=driver.getWindowHandles();
	
	for(String handle:allwindowhandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc123@gmail.com");
			driver.close();
		}
		driver.switchTo().window(parentwindow);
	}
	
	
	
	
	
	
	}

}
