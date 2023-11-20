package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class pagesrc {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("gmail text is present");
			
		}
		else
		{
			System.out.println("not present");
			
		}
		
	}
}
