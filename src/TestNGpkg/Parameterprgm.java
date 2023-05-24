package TestNGpkg;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterprgm {
	
	
	
	 ChromeDriver drive;
	 @BeforeTest
	 public void search()
	 {
			
	drive=new ChromeDriver();
	drive.get("https://www.google.com");
	 }
	 @Parameters("s")
	@Test
	public void Searchfield(String s)
	{
	//drive.findElement(By.name("s")).sendKeys("s",Keys.ENTER);
     drive.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(s,Keys.ENTER);	//textarea[@id='APjFqb']	
		System.out.println("page open successfully");		
	}
	 
	 
	 
	 
	}


