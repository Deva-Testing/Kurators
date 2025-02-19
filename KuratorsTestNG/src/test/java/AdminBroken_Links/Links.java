package AdminBroken_Links;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	
public static void main(String[] args) {
		
		WebDriver dri = new ChromeDriver();
		
		dri.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dri.get("http://34.225.116.122/admin");
		
		dri.manage().window().maximize();
		
		dri.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@kurators.com");
		
		dri.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
		
		dri.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		dri.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		
		System.out.println(" Numbr of Login page ");
		
		System.out.println("  DashBoard Page ");
		
		List<WebElement> link = dri.findElements(By.tagName("a"));
		
		int nobrok =0;
		
		System.out.println(" Number of Element is :- "+link.size());
		
		for(WebElement linkelement : link) {
			
			String herfele = linkelement.getAttribute("href");
			
			if(herfele == null || herfele.isEmpty()) {
				
				System.out.println(" herf attribute ");
				
				continue;
				
			}try {
//				String hefele = null;
				URL linksurl = new URL(herfele);
				HttpURLConnection con = (HttpURLConnection) linksurl.openConnection();
				con.connect();
				if (con.getResponseCode() >=400) {
					System.out.println(" herfele Links of Elements is Admin   ----->>>  Broken Links  <<<---- :- "+herfele);
					nobrok++;
					
				} else {
					System.out.println(" Herfele Not links of Elementis is Admin ---->> Not Brken links <<<----  "+herfele);
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
	System.out.println(" No of Broken links :- "+nobrok);	 
	}
	
}
