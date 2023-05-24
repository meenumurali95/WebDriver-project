package webdriverpkg;

import org.junit.After;


//import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailverify {

	
		ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver=new ChromeDriver();
			driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	    }
	
	    @Test
	    public void test(){
	    	
	        WebElement button=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]"));
	       
				String actualbutton= button.getAttribute("value");
				String exp="Check availability";
				if(exp.equals(actualbutton))
				{
					System.out.println("pass");
			}
				else
				{
					System.out.println("fail");
				}
	    }
	    
	    @After
		public void exit()
		{
			driver.quit();
		}
}
