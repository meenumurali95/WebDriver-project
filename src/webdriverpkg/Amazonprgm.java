package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonprgm {
	ChromeDriver drive;
	@Before
	public void open()
	{
		drive=new ChromeDriver();
		drive.get("https://www.amazon.in");
	}
	@Test
	public void test()
	{
		//drive.findElement(By.xpath("//input[@id='unifiedLocation1ClickAddress']")).sendKeys("mobile",Keys.ENTER);
	    drive.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile",Keys.ENTER);
	    drive.findElement(By.xpath("//span[@class='nav-line-2']")).click();
	    drive.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	    drive.findElement(By.xpath("//input[@type='email']")).sendKeys("adnhdbhcg",Keys.ENTER);
	    drive.findElement(By.xpath("//input[@id='continue']")).click();
	    drive.navigate().back();
	    drive.navigate().back();
		drive.findElement(By.xpath("//div[@id='nav-xshop']/a[5]")).click();
		drive.findElement(By.xpath("//a[@role='button']")).click();
		
	}
	@After
	public void exit()
	{
		drive.quit();
	}

}
