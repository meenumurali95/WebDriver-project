package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Alertprgm {
	EdgeDriver driver;
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/SYAM/Documents/program/alert_program1.html");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();//alert box will come and we have to handle it
		//switchto uses
		Alert a = driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Meenu");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Murali");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}

}
