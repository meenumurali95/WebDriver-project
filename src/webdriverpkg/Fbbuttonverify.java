package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Fbbuttonverify {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@Test
public void test()
{
	WebElement button=driver.findElement(By.name("login"));
	String exp="log in";
	String actual=button.getText();
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
public void exit()
{
	driver.quit();
}


}
