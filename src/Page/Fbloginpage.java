package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class Fbloginpage  {
	public WebDriver driver;
	
    By fbemail=By.id("email");
    By fbpswrd=By.name("pass");
    By fblogin=By.name("login");
 //constructor   
public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}
	

public void setvalues(String email,String pswrd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswrd).sendKeys(pswrd);
	driver.findElement(By.name("email")).clear();
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("pass")).clear();
	driver.findElement(By.name("pass")).sendKeys(pswrd);
	driver.findElement(By.name("login")).click();
}
public void login()
{
	driver.findElement(fblogin).click();
}
}