package TestNGpkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By; 

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rightclickguru {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
	@Test
	public void test()
	{
		WebElement rightclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick);
		WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
		
		WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	    actions.contextClick(doubleclick);
		driver.navigate().back();
		actions.perform();
	}

}
