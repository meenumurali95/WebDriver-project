package webdriverpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Linkelement 
{
	
		
		ChromeDriver drive;
		@Before
		public void setUp()
		{
			drive=new ChromeDriver();
			drive.get("https://www.google.com");
	    }
	    @Test
	    public void Searchfield()
	    {
	    	
		List<WebElement>li=drive.findElements(By.tagName("a"));
    	System.out.println("total number of links="+li.size());
    	// to get links in footersection
//		List<WebElement>li=drive.findElements(By.xpath("//*[@id='pageFooterChildren']/ul/li"));
//		System.out.println("total number of links="+li.size());
		
		for(WebElement s:li)
		{
			String link=s.getAttribute("href");
			System.out.println(link+"----"+s.getText());
		}
}
}