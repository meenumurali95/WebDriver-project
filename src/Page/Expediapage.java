package Page;
import java.time.Duration;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expediapage {
public WebDriver driver;
	    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30)); 
	    By flight=By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]");
	    By roundtrip=By.xpath("//*[@id=\"uitk-tabs-button-container\"]/div[1]/li[1]/a/span");
//	    By leavingfrom=By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div/div/div[1]/button");
//	    By Start=By.xpath("//*[@id=\"location-field-leg1-origin\"]");
//	    By goingto=By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div/div/div[1]/button");
//	    By desti=By.xpath("//*[@id=\"location-field-leg1-destination\"]");
//	    By departing=By.xpath("//*[@id=\"d1-btn\"]");
//	    By returing=By.xpath("//*[@id=\"d2-btn\"]");
//	    By traveler=By.xpath("//*[@id=\"adaptive-menu\"]/button");
//	    By economy=By.xpath("//*[@id=\"preferred-class-input-trigger\"]");
//	    By month=By.xpath("//*[@id=\\\"wizard-flight-tab-roundtrip\\\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/h2");
//	    By button=By.xpath("//*[@id=\\\"wizard-flight-tab-roundtrip\\\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]");
//	    By alldates=By.xpath("//*[@id=\\\"wizard-flight-tab-roundtrip\\\"]/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table/tbody/tr/td/button");
//	    By adult=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[1]/div/button[2]/span/svg");
//	    By child=By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div/div[2]/section/div[1]/div[2]/div/button[2]/span");
//	    By childdrpdwn= By.xpath("//*[@id=\"child-age-input-0-0\"]");
//	    By seatpre=By.xpath("//*[@id=\"preferred-class-input\"]/div/div/a[4]/span");
	   
	public Expediapage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void flightclick()
	{   
		wait.until(ExpectedConditions.visibilityOfElementLocated(flight));
		driver.findElement(flight).click();
	}	
	public void roundtripclick()
	{
		driver.findElement(roundtrip).click();
	}
	//public void leaving()
	//{
//		driver.findElement(leavingfrom).click();
	//}
	//public void start(String place)
	//{
//		driver.findElement(Start).sendKeys(place);
	//}
	//public void goingto()
	//{
//		driver.findElement(goingto).click();
	//}
	//public void desti(String placee )
	//{
//		driver.findElement(desti).sendKeys(placee);
	//}	
	//public void departingdate()
	//{
//		driver.findElement(departing).click();
//		while(true)
//		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(month));
//			WebElement months=driver.findElement(month);
//			    String monthexp=months.getText();
//			if(monthexp.equals("August 2023"))
//			{
//				System.out.println("month selected="+monthexp);
//				break;
//			}
//			else
//			{
//				wait.until(ExpectedConditions.visibilityOfElementLocated(button));
//				driver.findElement(button).click();
//			    }
//		}
//		List<WebElement> alldates1=driver.findElements(alldates);
//	    for(WebElement dateelement:alldates1)
//	    {
//	    	String date=dateelement.getAttribute("data-day");
//	        if(date.equals("20"))
//	    	{
//	    		dateelement.click();
//	    		System.out.println("date selected is="+date);
//	    		break;
//	        }
//	    }
	//}	
	//public void returndate()
	//{
//		driver.findElement(returing).click();
//		while(true)
//		{
//			wait.until(ExpectedConditions.visibilityOfElementLocated(month));
//			WebElement months=driver.findElement(month);
//			    String monthexp=months.getText();
//			if(monthexp.equals("August 2023"))
//			{
//				System.out.println("month selected="+monthexp);
//				break;
//			}
//			else
//			{
//				wait.until(ExpectedConditions.visibilityOfElementLocated(button));
//				driver.findElement(button).click();
//			    }
//		}
//		List<WebElement> alldates1=driver.findElements(alldates);
//	    for(WebElement dateelement:alldates1)
//	    {
//	    	String date=dateelement.getAttribute("data-day");
//	        if(date.equals("25"))
//	    	{
//	    		dateelement.click();
//	    		System.out.println("date selected is="+date);
//	    		break;
//	        }
//	    }
	//}
	//public void travelers()
	//{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(traveler));
//		driver.findElement(traveler).click();
//		driver.findElement(adult).click();
//		driver.findElement(adult).click();
//		driver.findElement(child).click();
//		WebElement age=driver.findElement(childdrpdwn);
//		Select se=new Select(age);
//		se.selectByVisibleText("3");
	//}
	//public void seat()
	//{
//		wait.until(ExpectedConditions.visibilityOfElementLocated(economy));
//		driver.findElement(economy).click();;
//		driver.findElement(seatpre).click();
	//	
	//	
	//}
	}


