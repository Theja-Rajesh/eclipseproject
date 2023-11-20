package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmailbutton {
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				
	 v	
	}
	@Test
	public void test()
	{
	
	WebElement button=driver.findElement(By.xpath("//input[@id='Register']"));

    if(button.getAttribute("Create my account >>") != null)

{

System.out.println("Pass");



},  

else

{

System.out.println("Failed");



}

}

}
	

}
