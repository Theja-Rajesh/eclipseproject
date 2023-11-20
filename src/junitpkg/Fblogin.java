package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void fblogin()
	{
		driver.findElement(By.id("email")).sendKeys("theja@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123thej");
		driver.findElement(By.name("login")).click();
	}
		
		@After
		public void tearDown()
		{
			driver.quit();
			
		}
	}
	
