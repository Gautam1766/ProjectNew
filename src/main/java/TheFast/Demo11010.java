package TheFast;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11010 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String s1=js.executeScript("return document.domain;").toString();
		System.out.println(s1);
		
		String s2=js.executeScript("return document.URL;").toString();
        System.out.println(s2);
        
        String s3=js.executeScript("return document.title;").toString();
        System.out.println(s3);
	}

}
