package webdriverpkg;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Firstscript {//TO OPEN BROWSER

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");//use this if we don't get google page open using chromedriver object
		ChromeDriver drive=new ChromeDriver();
        drive.get("https://www.google.com");
        
        EdgeDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        FirefoxDriver driv=new FirefoxDriver();
        driv.get("https://www.google.com");
 // TO VERIFY TITLE NEXT
        
	}

}
