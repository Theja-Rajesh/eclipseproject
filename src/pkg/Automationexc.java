package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationexc {
	ChromeDriver driver;

	 

	@Before

	public void setup()

	{

	      driver=new ChromeDriver();

	      driver.get("https://automationexercise.com/products");

	}

	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")).click();

        cd.findElement(By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")).click();

        cd.findElement(By.xpath("//*[@id=\"Women\"]/div/ul/li[1]/a")).click();

        cd.findElement(By.xpath("/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a/i")).click();

        //cd.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button")).click();

        //cd.findElement(By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button")).click();

        cd.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Nooha khaleel");

        cd.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("noohashihas@gmail.com");

        cd.findElement(By.xpath("//*[@id=\"review\"]")).sendKeys("Very nice ");

       cd.findElement(By.xpath("//*[@id=\"button-review\"]")).click();

  }



}
	}
	
	

}
