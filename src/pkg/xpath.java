package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
	}
	@Test
	public void xpath()
	{
		driver.findElement (By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2344");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}

