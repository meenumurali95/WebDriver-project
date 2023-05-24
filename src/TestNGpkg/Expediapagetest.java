package TestNGpkg;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Expediapagetest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
	   driver= new ChromeDriver();
	   driver.get("https://www.expedia.com/?=one-key-onboarding-dialog");
	   driver.manage().window().maximize();
	}
	@Test
	public void test()
	{    
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); 
//booking flight from brussels to newyork	    
		 driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a/span")).click();
		 driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]")).sendKeys("Brussels",Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]")).sendKeys("Newyork",Keys.ENTER);
//selecting number of passengers 		
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"adaptive-menu\"]/button")));
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/button")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]")));
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]")));
		driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]")).click();
		WebElement age=driver.findElement( By.xpath("//*[@id=\"child-age-input-0-0\"]"));
		Select se=new Select(age);
		se.selectByVisibleText("3");
//	selecting seat preference	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"preferred-class-input-trigger\"]")));
		driver.findElement(By.xpath("//*[@id=\"preferred-class-input-trigger\"]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span")));
		driver.findElement(By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span")).click();

//Selecting departure date		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"d1-btn\"]")));   
	     driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
		 while(true)
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2")));
					WebElement months=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
					    String monthexp=months.getText();
					if(monthexp.equals("October 2023"))
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
		 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button")));
		List<WebElement> alldates1=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
				for(WebElement dateelement:alldates1)
			    {
					System.out.println(dateelement);
			    	String date=dateelement.getAttribute("data-day");
			        if(date.equals("20"))
			    	{
			    		dateelement.click();
			    		System.out.println("date selected is="+date);
			    	}
			    }
//	selecting return date			
	     		
		 driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();        
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"d2-btn\"]")));
		 driver.findElement(By.xpath("//*[@id=\"d2-btn\"]")).click();
		
		 while(true)
				{
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/h2")));
					WebElement month=driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/h2"));
					    String monthexp=month.getText();
					if(monthexp.equals("December 2023"))
					{
						System.out.println("month selected="+monthexp);
						break;
					}
					else
					{
						wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]")));
						driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
					}
				}
		 
		 List<WebElement> alldates2=driver.findElements(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button"));
		 for(WebElement dateelement2:alldates2)
			    {
			    	String date2=dateelement2.getAttribute("data-day");
			        if(date2.equals("25"))
			    	{
			    		dateelement2.click();
			    		System.out.println("date selected is="+date2);
			    		break;
			        }
			    }
		 driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[2]/div/button")).click();
		 }
	     
	}

		 
		
		
		
		   
	


