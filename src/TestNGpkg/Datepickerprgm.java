package TestNGpkg;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerprgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.expedia.com");
		driver.manage().window().maximize();
	}
    
	@Test
    public void test1()
    {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
    	driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span")).click();
    	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
    	while(true)
    	{
    		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2")));
    		WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
   		    String monthexp=month.getText();
    		if(monthexp.equals("December 2023"))
    		{
    			System.out.println("month selected="+monthexp);
    			break;
    		}
    		else
    		{
    			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")));
    			driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
  		    }
    	}
    	List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
        for(WebElement dateelement:alldates)
        {
        	String date=dateelement.getAttribute("data-day");
//        	System.out.println(date);
        	if(date.equals("20"))
        	{
        		dateelement.click();
        		System.out.println("date selected is="+date);
        		
        	}
        }
     }
    
}
