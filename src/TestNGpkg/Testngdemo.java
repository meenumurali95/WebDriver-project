package TestNGpkg;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	ChromeDriver drive;
	
	@BeforeTest
	public void setup()
	
	{
		drive=new ChromeDriver();
		drive.get("https://www.google.com");
	}
	@BeforeMethod
	public void urlloading()
	{
		drive.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test(invocationCount=3)
	public void logo()
	{
Boolean logo=drive.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)
		{
			System.out.println("Logo is present");
		}
		else
		{
			 System.out.println("Logo is not present");
		}
	}
	@Test(priority=1)
	public void buttonenable()
	{
		Boolean button=drive.findElement(By.xpath("//input[@type='button']")).isEnabled();
		if(button)
		{
			System.out.println("Button is enable");
		}
		else
		{
			System.out.println("Button is disable");
		}
	}
	@Test(priority=2,dependsOnMethods= {"buttonenable"})
	public void buttontext()
	{
		 WebElement button=drive.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
	       
			String actualbutton= button.getAttribute("value");
			String exp="Check availability";
			if(exp.equals(actualbutton))
			{
				System.out.println("pass");
		}
			else
			{
				System.out.println("pass");
			}
	}
	@AfterMethod
	public void meth()
	{
		System.out.println("Aftermethod");
	}
	}


