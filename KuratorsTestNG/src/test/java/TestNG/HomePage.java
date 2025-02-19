package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {

	WebDriver dri;
	
	@Test(priority = 1)
	void open() {
		dri=new ChromeDriver();
		
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dri.get("http://34.225.116.122/home-page");
		dri.manage().window().maximize();
		
		System.out.println(" Open the WebPage ..... ");
	}
	@Test(priority = 2)
	void login() {
		
	}
	@Test(priority = 3)
	void logOut() {
		
	}
	
}
