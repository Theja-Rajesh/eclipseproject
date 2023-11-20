package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;


public class fbtitleverification {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		}
@Test
public void test()
{
	String exp="Facebook";
	String actualtitle=driver.getTitle();
    Assert.assertEquals(actualtitle,exp);;
    if(exp.equals(actualtitle))
    {
    	System.out.println("pass");
    	
    }
    else
    {
    	System.out.println("fail");
    	
    }
    System.out.println("haii");
    
}
}
