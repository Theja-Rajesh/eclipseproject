package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automationex {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
	@Test
	public void test()
	{
	driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Theja rajesh");
	driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("thejarajesh58@gmail.com");
	driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
	driver.findElement(By.xpath("//input[@id='id_gender2']")).click();
	driver.findElement(By.xpath("//input[@data-qa='password']")).sendKeys("the123@");
	
	WebElement day=driver.findElement(By.xpath("//select[@id='days']"));
	Select daydetails=new Select(day);
	daydetails.selectByValue("05");
	
	WebElement month=driver.findElement(By.xpath("//select[@id='months']"));
	Select monthdetails=new Select(month);
	daydetails.selectByValue("August");
	
	WebElement year=driver.findElement(By.xpath("//select[@id='years']"));
	Select yeardetails=new Select(year);
	daydetails.selectByValue("2001");
	driver.findElement(By.xpath("//input[@id='newsletter']")).click();
	driver.findElement(By.xpath("//input[@id='optin']")).click();
	
	driver.findElement(By.xpath("//input[@data-qa='first_name']")).sendKeys("Theja");
	driver.findElement(By.xpath("//input[@data-qa='last_name']")).sendKeys("rajesh");
	driver.findElement(By.xpath("//input[@data-qa='company']")).sendKeys("luminar technolab");
	driver.findElement(By.xpath("//input[@data-qa='address']")).sendKeys("janani pallikunnu");
	driver.findElement(By.xpath("//input[@data-qa='address2']")).sendKeys("kannur");
	
	WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
	Select countrydetails=new Select(country);
	countrydetails.selectByValue("India");
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
