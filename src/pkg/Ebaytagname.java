package pkg;

 

import java.util.List;

 

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

 

public class Ebaytagname

{

ChromeDriver cd;

@Before

public void setUp()

{

              cd=new ChromeDriver();

              cd.get("https://www.ebay.com");

}

@Test

public void search()

{

              List <WebElement>li=cd.findElements(By.tagName("a"));

              System.out.println("total number of links="+li.size());

 

 

for(WebElement link:li)

{
	//String link=link.getAttribute("href");
	//String text=link.getText();
	//System.out.println(link+"-----------"+text);

              System.out.println(link.getText() + " - " + link.getAttribute("href"));

}

}

}