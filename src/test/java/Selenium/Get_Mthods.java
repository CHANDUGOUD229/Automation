package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Mthods 
{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
//		Object   cObject=driver.getClass();
//		System.out.println("getClasss ::    "+cObject);
//		
//		String urlString=driver.getCurrentUrl();
//		System.out.println(urlString);
//		
//		String pageString=driver.getPageSource();
//		//System.out.println(pageString);
//		
//		String	title=driver.getTitle();
//		System.out.println(title);
//		
//		String   window=driver.getWindowHandle();
//		System.out.println(window);
//		
//		 Set<String>     handles=driver.getWindowHandles();
//		 System.out.println(handles);
//		
//		String      tagname=driver.findElement(By.name("q")).getTagName();
//		System.out.println("tage name  :  "+tagname);
//		Point      location=driver.findElement(By.name("q")).getLocation();
//		System.out.println(" location  :  "+location);
//		Dimension      getsize=driver.findElement(By.name("q")).getSize();
//		System.out.println(" getSize   :   "+getsize);
		String	attivalue=driver.findElement(By.name("btnK")).getAttribute("type");
		
		System.out.println("Attribute value  :"+attivalue);
		
	//String ssString=	driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).getCssValue("color");
	//	System.err.println("color  ::  "+ssString);
		driver.close();
		
	}

}
