package TestNGpkg;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https:/www.facebook.com");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws IOException
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\SYAM\\Documents\\datadrivenprjct\\datadriven1.xlsx");;
		XSSFWorkbook wb=new XSSFWorkbook(ob);
		XSSFSheet sh=wb.getSheet("sheet1");//workbook
		int rowcount=sh.getLastRowNum();//sheet1 details
		for(int i=0;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("username="+username);
			System.out.println("password="+password);
			
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
//			driver.navigate().refresh();
		}
    }

}
