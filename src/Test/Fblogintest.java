package Test;


import org.testng.annotations.Test;


import Page.Fbloginpage;

public class Fblogintest extends Baseclass1 {
	
	@Test
	public void fblogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com","abc1234");
		ob.login();
	}

}
