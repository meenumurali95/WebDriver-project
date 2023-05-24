package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesourceprgm {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
		drive.get("https://www.google.com");
//to check a text present in the page,we need to get the source code
		String src=drive.getPageSource();//here we get a string and is stored to a string src
		//we have to check a text contained in the page so we use contains method
		if(src.contains("Gmail"))//CASE WILL BE CHECKED.IF I GIVE gmail,result=fail
				{
			System.out.println("pass");
				}
		else
		{
			System.out.println("fail");
		}
		String sr=drive.getPageSource();
		if(sr.contains("Images"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
