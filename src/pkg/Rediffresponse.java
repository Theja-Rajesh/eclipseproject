package pkg;
import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

 

public class Rediffresponse

{

ChromeDriver cd;

 

 

@Before

public void setUp()

{

      cd=new ChromeDriver();

      cd.get("https://register.rediff.com/register/register.php?FormName=user_details");

}

@Test

public void test()

{

     

      boolean gender=cd.findElement(By.xpath("//input[@value='m']")).isSelected();

      if(gender)

      {

           System.out.println("loated");

      }

      else

      {

           System.out.println("not located");

      }

}

}

 




