package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniscript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("keerthi suresh");
Thread.sleep(2000);
WebElement se = driver.findElement(By.xpath("(//input[@value='Google Search'])[1]"));
for(int i=0;i<=3;i++)
{
	Thread.sleep(2000);
	jse.executeScript("window.scrollBy(0,500)");
	
}
driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]")).click();
Thread.sleep(2000);
List<WebElement> link = driver.findElements(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
/*
for(WebElement link1:link)
{
jse.executeScript("window.scrollBy(0,500)");
for(int i=0;i<=2;i++)
{
	WebElement g = driver.findElement(By.xpath("//h3[text()='Keerthy Suresh - Wikipedia']"));
	g.click();
	String dd = g.getText();
	System.out.println(dd);
}

}
*/
link.get(4);

WebElement g = link.get(5);
String s = g.getText();
System.out.println(s);
	
}		
}
