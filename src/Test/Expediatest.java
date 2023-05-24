package Test;

import org.testng.annotations.Test;

import Page.Expediapage;

public class Expediatest extends Baseclass2 {
	@Test
	public void Test1()
	{
		
		Expediapage ob=new Expediapage(driver);
		ob.flightclick();
		ob.roundtripclick();
//		ob.leaving();
//		ob.start("Brussels");
//		ob.goingto();
//		ob.desti("Newyork");
//		ob.departingdate("06/15/2023");
//		ob.returndate();
//		ob.travelers();
//		ob.seat();
}
}