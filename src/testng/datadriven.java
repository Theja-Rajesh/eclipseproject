package testng;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@Test
	public void test()throws Exception
	{
		FileInputStream ob=new FileInputStream("C:\\Users\\Theja Rajesh\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(ob);//workbook
		XSSFSheet sh= wb.getSheet("Sheet1");//sheetdetails
		int row=sh.getLastRowNum();//row details
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
					System.out.println("username="+username);
					String password=sh.getRow(i).getCell(1).getStringCellValue();
					System.out.println("password="+password);
					
					driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).clear();
			        
		}
	}
	
	
	

}
