package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftitleprgm {

	ChromeDriver drive;
	@Before
	public void setUp()
	{
		drive=new ChromeDriver();
		drive.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{   
		Boolean logo=drive.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		
//		String Title = el.getAttribute("title");
		if(logo)
		{
			System.out.println("Logo is present");
		}
		else
		{
			 System.out.println("Logo is not present");
		}
//		String st=drive.getPageSource();
//		if(st.contains("rediff.com"))
//		{
//	      System.out.println("pass");
//		}
//       else
//        {
//	      System.out.println("fail");
//        }
		//img[@title='Rediff.com']
	}
	@After
	public void exit()
	{
		drive.quit();
	}
}
