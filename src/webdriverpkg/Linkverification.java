package webdriverpkg;

import java.net.HttpURLConnection;
import java.net.URL;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkverification {
	ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("http://www.facebook.com");
}
@Test
public void Test()
{
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("total number of links="+li.size());

for(WebElement s:li)
{
	String link=s.getAttribute("href");
	System.out.println(link+"----"+s.getText());
	verifylink(link);
}
}
public void verifylink(String link)
{
	try
	{
		URL u=new URL(link);//type casting
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("sucessful response code=200----"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("brokenlink 404----"+link);
		}
    }
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
