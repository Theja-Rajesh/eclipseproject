package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertmessage {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("file:///C:/Users/Theja%20Rajesh/Desktop/alert.html");
	}
	@Test
	public void display()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Theja");

	      driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rajesh");

	      driver.findElement(By.xpath("//input[@type='submit']")).click();

	      
	}
	

}
