package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class crossbrowsertesting {
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}else if (browser.equalsIgnoreCase("firefox"));
		{
			driver=new FirefoxDriver();
			
		}
		{
			driver=new EdgeDriver();
			
		}
	}
	@Test
	public void test() {
		driver.get("https://www.google.com);
	}
	
	
	

}
