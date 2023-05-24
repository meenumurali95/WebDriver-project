package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverificationpgm {

	public static void main(String[] args) {
		ChromeDriver drive=new ChromeDriver();
        drive.get("https://www.google.com");//chrome got opened,page loaded
        //expectation stored to a string
        String exptitle="Google.com";
        String actualtitle=drive.getTitle();//TO GET ACTUAL TITLE AND IS STORED TO A STRING
        //NOW WE HAVE TO COMPARE THESE TWO THEREFORE WE USE EQUALS METHOD
        System.out.println("actualtitle="+actualtitle);
        if(exptitle.equals(actualtitle))
        {
        	System.out.println("pass");	
        }
        else
        {
        	System.out.println("fail");
        }//assertion can also be used
	}//code to close opened page

}//next to check a text contained in a page
