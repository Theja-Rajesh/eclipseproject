package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	WebDriver driver;
	 
	By Createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[2]/button/div/div");
			public Fbcreatepage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void pageclick()
	{
		driver.findElement(Createpage).click();
		
	}

	public void getstartedbutton()
	{
	 driver.findElement(getstarted).click();
	}
}
