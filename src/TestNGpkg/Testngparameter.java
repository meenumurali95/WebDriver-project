package TestNGpkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameter {
    @Parameters("s")
	@Test
	public void main(String s)
	{
		//String s =null;
		System.out.println("value="+s);
	}
}
