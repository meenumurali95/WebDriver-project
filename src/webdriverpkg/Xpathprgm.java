package webdriverpkg;

import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprgm {
	
	ChromeDriver driver;
	@Before
	public void SetUp(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");	
	}
	@Test
		public void Testing()
		{
//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abchdh",Keys.ENTER);
		driver.findElement(By.xpath("/input[@id='email']")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd");
		driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
		}
		

	}


