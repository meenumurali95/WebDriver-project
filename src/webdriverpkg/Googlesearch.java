package webdriverpkg;

import org.junit.Before;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googlesearch {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	@Test
	public void test()
	{
		driver.findElement(By.id("input")).sendKeys("mobiles");
		driver.findElement(By.id("icon")).click();
	}

}
