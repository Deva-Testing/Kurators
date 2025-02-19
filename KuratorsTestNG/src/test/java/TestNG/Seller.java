package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seller {

	WebDriver dri;
	
	@Test(priority = 1)
	void open() {
		
		dri=new ChromeDriver();
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		dri.get("http://34.225.116.122/seller/register");
//		http://34.225.116.122/seller
		dri.get("http://34.225.116.122/seller");
		dri.manage().window().maximize();
		
	}
	
	@Test(priority = 2)
	void login() {
		
		dri.findElement(By.xpath("//input[@id='email']")).sendKeys("testcase@gmail.com");
		dri.findElement(By.xpath("//input[@id='password']")).sendKeys("123123123");
		dri.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		dri.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
	}

}
