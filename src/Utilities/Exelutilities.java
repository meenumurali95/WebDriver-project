package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelutilities {
	 public static String getcellvalues(String x1,String sheetname,int r,int c)
	 {
		 try
		 {
			 FileInputStream f=new FileInputStream(x1);
			 XSSFWorkbook wb=new XSSFWorkbook(f);
			 XSSFCell cell = wb.getSheet(sheetname).getRow(r).getCell(c);
			 if(cell.getCellType()==CellType.STRING)
			 {
				 return cell.getStringCellValue();
			 }
			 else
			 {
				 //double v=cell.getNumericCellValue();
//				 return String.valueOf(v);
				 return cell.getRawValue();
			 }
		 }
		 catch(Exception e)
		 {
			 return "error";
		 }
	 }
	 public static int getrowcount(String x1,String sheetname)
	 {
		 try
		 {
			 FileInputStream f=new FileInputStream(x1);
			 XSSFWorkbook wb=new XSSFWorkbook(f);
			 return wb.getSheet(sheetname).getLastRowNum();
		 }
		 catch(Exception e)
		 {
			 return 0;
		 }
	 }

}
