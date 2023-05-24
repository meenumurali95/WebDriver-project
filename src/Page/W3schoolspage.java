package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class W3schoolspage {
	
	public WebDriver driver;
	
	By emailid=By.xpath("//*[@id=\"modalusername\"]");
	By password=By.xpath("//*[@id=\"current-password\"]");
	By login= By.xpath("//*[@id=\"root\"]/div/div/div[4]/div[1]/div/div[4]/div[1]/button");
	
public W3schoolspage(WebDriver driver)
{
	this.driver=driver;
}

public void setvalues(String email,String pswrd)
{
	driver.findElement(emailid).sendKeys(email);
	driver.findElement(password).sendKeys(pswrd);
}
public void login()
{
	driver.findElement(login).click();
}
}
