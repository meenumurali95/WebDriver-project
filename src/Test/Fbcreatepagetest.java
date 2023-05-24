package Test;

import org.testng.annotations.Test;



import Page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass1 {
 @Test
 public void click()
 {
	 Fbcreatepage page=new Fbcreatepage(driver);
	 page.createpageclick();
	 page.getstartedclick();
 }
}
