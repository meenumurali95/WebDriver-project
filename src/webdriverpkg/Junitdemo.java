
]package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;//null value
	@Before
	public void SetUp()
	{
    //ChromeDriver driver=new ChromeDriver();//it will take as null.driver and chance for nullpoint exception
    driver=new ChromeDriver();
	driver.get("https://www.google.com");
	}
	@Test
	public void Titleverification()
	{
		String exp="Google";
		String actual=driver.getTitle();
		if(exp.equals(actual))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@After
	public void Teardown()
	{
		driver.quit();
	}
}
