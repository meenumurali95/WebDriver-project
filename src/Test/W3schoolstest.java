package Test;

import org.testng.annotations.Test;

import Page.W3schoolspage;

public class W3schoolstest extends W3schoolsbaseclass{
	@Test
	public void test() {
		W3schoolspage ws=new W3schoolspage(driver);
		ws.setvalues("abc123@gmail.com","abcd1234@");
		ws.login();
	}
	
	
	
	

}
