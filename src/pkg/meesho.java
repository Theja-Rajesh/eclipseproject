package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class meesho {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.meesho.com");
		String src=driver.getPageSource();
		if(src.contains("maxi dress"))
		{
			System.out.println("maxi dress present");
			
		}
		else
		{
			System.out.println("maxi dress not  present");
			
		}
		
	}
}
