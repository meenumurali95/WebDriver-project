package TestNGpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test1()
	{
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drophere=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragme, drophere);
		act.perform();
		
	}


	
	@Test (dependsOnMethods= {"test1"})
	public void test2()
	{
		
		WebElement foo = new WebDriverWait(driver, Duration.ofSeconds(10))
		          .until(driver -> driver.findElement(By.cssSelector("#droppable > p")));
		Assert.assertEquals(foo.getText(), "Dropped!");
		WebElement droppedText = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		System.out.println("pass");
//		
//		Actions act=new Actions(driver);
//        String actualText = droppedText.getText();//"Dropped!"
//        Assert.assertEquals(actualText, droppedText);
////        act.perform();
//        ChromeDriver wait = new ChromeDriver();
		  
//        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.elementToBeClickable(By.name("Dropped!")));
//        System.out.println(firstResult.getText());
//        WebElement dropped = wait.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
//      Assert.assertEquals("Dropped!", firstResult.getText());  
//        Assert.assertEquals(firstResult.getText(), "Dropped!");
	}

}
