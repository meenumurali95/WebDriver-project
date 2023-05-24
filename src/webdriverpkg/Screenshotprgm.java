package webdriverpkg;

import java.io.File;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotprgm {
	ChromeDriver drive;
	@Before
	public void setUp()
	{
		drive=new ChromeDriver();
		drive.get("https://www.google.com");
	}
	@Test
	public void scrrenshot() throws IOException
	{
		//screenshot of google page stored in c drive
//		File src=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("C:\\Users\\SYAM\\Desktop\\Screenshot\\screenshot1.png"));
		
		WebElement button=drive.findElement(By.xpath("//div[@class='L3eUgb']/div[1]"));
		File src1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,new File("./Screenshot/error.png"));
		
//		screenshot saved to our project
//		File src1=((TakesScreenshot)drive).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src1, new File("./Screenshot/error.png"));
		
	}
	

}
