package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementstest {
	ChromeDriver drive;
	@Before
	public void setUp()
	{
		drive=new ChromeDriver();
		drive.get("https://www.facebook.com");
	}
	@Test
	public void Testwebelements()
	{
		drive.findElement(By.name("email")).sendKeys("abc@gmail.com");
		drive.findElement(By.id("email")).sendKeys("abc123");
		drive.findElement(By.name("login")).click();
	}
	@After
	public void teardown()
	{
		drive.quit();
	}
}
