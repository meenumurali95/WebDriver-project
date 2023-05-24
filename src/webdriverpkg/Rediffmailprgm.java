package webdriverpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Rediffmailprgm {
	
	ChromeDriver drive;
	@Before
	public void setUp()
	{
		drive=new ChromeDriver();
		drive.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	
		public void Test()
		{
//DAY
		WebElement day = drive.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select dayelement = new Select(day);
		dayelement.selectByVisibleText("01");
		
		List<WebElement> dropdowns =dayelement.getOptions();
//		int count = dropdowns.size();
		System.out.println("Number of dropdowns on the page: " +dropdowns.size());

//MONTH		
		WebElement month = drive.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
		Select monthelement = new Select(month);
		monthelement.selectByValue("01");
		
		List<WebElement> mon =monthelement.getOptions();
//		int count = dropdowns.size();
		System.out.println("Number of months: " +mon.size());
		
		for(WebElement s:mon)
		{
			s.getAttribute("select");
			System.out.println(s.getText());
		}

//YEAR		
		WebElement year = drive.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
		Select yearelement = new Select(year);
		yearelement.selectByVisibleText("2023");
		
		List<WebElement> ye =yearelement.getOptions();
		System.out.println("Number of year: " +ye.size());
		
		}
	
      @After

      public void teardown()
      {
	     drive.quit();
      }
}
