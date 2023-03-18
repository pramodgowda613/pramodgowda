package scripts2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Childbrowserclose {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement g = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[.='मराठी']"))));
WebElement b = driver.findElement(By.xpath("//a[.='हिन्दी']"));
WebElement r = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));


Actions act=new Actions(driver);
Robot ro=new Robot();
ArrayList<WebElement> arr=new ArrayList<WebElement>();
arr.add(g);
arr.add(b);
arr.add(r);
for(WebElement m:arr)
	
{
	act.contextClick(m).perform();
	ro.keyPress(KeyEvent.VK_T);
	ro.keyRelease(KeyEvent.VK_T);//to open multiple tab and right click on all the tab 
	
      int f = arr.size();
      System.out.println(f);
//if(m.equals(b))
//{
//	driver.close();
//}

}
Set<String> u = driver.getWindowHandles();t
for(String kl:u)

	driver.switchTo().window(kl);
          String hg = driver.getTitle();
	
	System.out.println(hg);
	
	ArrayList<String> red=new ArrayList<>(u);
	
	for(  String ko:red)
	{
String ih = red.get(2);
System.out.println(ih);
	}
}
	}







	
	
	
