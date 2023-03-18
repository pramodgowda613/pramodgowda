package scripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Downloads/selena/city.html");
	Thread.sleep(2000);
	WebElement sel = driver.findElement(By.id("city"));
Select drop=new Select(sel);
/*
 drop.selectByIndex(1); 
 WebElement text = drop.getFirstSelectedOption();
String selected = text.getText();
System.out.println(selected);
*/
/*
drop.selectByVisibleText("tumakuru");
Thread.sleep(1000);
drop.selectByValue("3");
Thread.sleep(2000);
List<WebElement> s = drop.getAllSelectedOptions();
for(WebElement dr:s)
{
	String b = dr.getText();
	System.out.println(b);
	}
	*/
/*
List<WebElement> d = drop.getOptions();
for(WebElement gr:d)
{
	String s = gr.getText();
	System.out.println(s);
	}
	*/
/*
List<WebElement> g = drop.getOptions();   //converting collection to single data we use for loop
ArrayList<String> ne=new ArrayList<String>();
for(WebElement gf:g)
{
	String h = gf.getText();
	 ne.add(h);
	
}
Collections.sort(ne);
for(String n:ne)
{
	System.out.println(n);
}
*/
List<WebElement> g = drop.getOptions();

ArrayList<String> ne=new ArrayList<String>();
for(WebElement gf:g)
{
	String h = gf.getText(); //single text data
	 ne.add(h);
	
}
/*
Collections.sort(ne);
for(int i=ne.size()-1;i>=0;i--) //if not using -1 arrayindex outofexception will through
{
String df = ne.get(i);	
System.out.println(df);

}
*/
Collections.sort(ne,Collections.reverseOrder());
for(String red:ne)
{
	System.out.println(red);
}
}
}

