package webdriverpkg;

//import org.junit.After

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgoogle {
	
		ChromeDriver drive;
		@Before
		public void setUp()
		{
			drive=new ChromeDriver();
			drive.get("https://www.google.com");
		}
		@Test
		public void Searchfield()
		{
			drive.findElement(By.name("q")).sendKeys("car",Keys.ENTER);
//			//drive.findElement(By.name("btnk")).click();
//			drive.findElement(By.id("input")).sendKeys("mobiles");
//			drive.findElement(By.id("icon")).click();
			
		}
//		@After
//		public void teardown()
//		{
//			drive.quit();
//		}

}
