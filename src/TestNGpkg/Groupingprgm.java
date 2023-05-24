package TestNGpkg;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Groupingprgm {
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		System.out.println("browser open");
	}
	
@Test(groups= {"smoke"})
public void test1()
{
	System.out.println("Test1");
}
@Test(groups= {"smoke"})
public void test2()
{
	System.out.println("Test2");
}
@Test(groups= {"smoke"})
public void test3()
{
	System.out.println("Test3");
}
@Test(groups= {"smoke","sanity"})
public void test4()
{
	System.out.println("Test4");
}
@Test(groups= {"sanity","regression"})
public void test5()
{
	System.out.println("Test5");
}
@Test(groups= {"regression"})
public void test6()
{
	System.out.println("Test6");
}
@AfterMethod
public void method()
{
	System.out.println("Aftermethod");
}

}
