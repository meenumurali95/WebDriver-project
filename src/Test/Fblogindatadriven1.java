package Test;


import org.testng.annotations.Test;


import Page.Fbloginpage;
import Utilities.Exelutilities;

public class Fblogindatadriven1 extends Baseclass1 {
	@Test
	public void fblogintest1()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		//reading data from exel file by the specified path
		String x1="C:\\Users\\SYAM\\Documents\\datadrivenprjct\\datadriven1.xlsx";
		String sheetname="Sheet1";
		int rowCount=Exelutilities.getrowcount(x1,sheetname);
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++)
		{
			
			String email=Exelutilities.getcellvalues(x1, sheetname, i, 0);
			System.out.println("Username= "+email);
			String pswrd=Exelutilities.getcellvalues(x1, sheetname, i, 1);
			System.out.println("password= "+pswrd);
//			passing username and password as parameters
			ob.setvalues(email,pswrd);
//			clicking submit button
			ob.login();
			
		}
		
	}

}
