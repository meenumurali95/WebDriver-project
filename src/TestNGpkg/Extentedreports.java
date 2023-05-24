package TestNGpkg;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class Extentedreports {
	WebDriver driver;
	String url="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	
	@BeforeTest
	public void beforetest()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname", "localhost");
		extent.setSystemInfo("OS","Windows 11");
		extent.setSystemInfo("Tester name", "Meenu");
		extent.setSystemInfo("Browser name", "chrome");
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void setup()
	{
		driver.get(url);
	}
	@Test
	public void fbtitleverification() throws IOException
	{
		test=extent.createTest("FBTitleverification");
		String exp="facebook";
		String actual=driver.getTitle();
//		if(exp.equals(actual))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
		Assert.assertEquals(exp,actual);
	}
	@AfterTest
	public void Teardown()
	{
		extent.flush();
	}
	
	@AfterMethod
	public void reportgen(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE);
		{
			test.log(Status.FAIL,"test case failed is"+result.getName());
			test.log(Status.FAIL,"test case failed is"+result.getThrowable());
		}
		if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP,"test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test case passed is"+result.getName());
		}
	}
	

}
