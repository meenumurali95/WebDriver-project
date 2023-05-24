package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class W3schoolsbaseclass {

	public WebDriver driver;
@BeforeClass	
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
	driver.manage().window().maximize();
}
	
	
	
}
