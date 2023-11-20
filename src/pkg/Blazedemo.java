package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.BlazeDemo.com/register");
	}
	@Test
	public void xpath()
	{
		driver.findElement(By.xpath("//input[@name='token']")).sendKeys("Thejarajesh");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("infosys");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("theja@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("113@the");
	}
	

}
