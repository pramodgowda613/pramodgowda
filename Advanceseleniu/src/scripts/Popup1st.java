package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1st {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	/*
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	driver.get("https://demoqa.com/alerts");
	Thread.sleep(2000);
	 WebElement f = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
*/

	//driver.findElement(By.xpath("(//button[.='Click me'])[1]")).click();
	/*
	 driver.get("https://www.oyorooms.com/?utm_source=google&utm_medium=cpc&utm_device=c&utm_campaign=India_SEM_Brand_generic&utm_campaignid=1701551904&utm_adgroup=71982097371&utm_content=538023998106&utm_keyword=oyo&gclid=CjwKCAiA3KefBhByEiwAi2LDHGexuyMFTOX-HUrCFkcGnAUKtNMcLov7MzdskqDhpCgvmna9qxRCrBoCGIYQAvD_BwE");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//span[text()='Tue, 14 Feb']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[text()='Search']/../../div[2]/div/span/div/div/div[3]/table/tbody/tr[2]/td[7]")).click();
*/

	
	driver.get("https://demoqa.com/browser-windows");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[.='New Tab']")).click();
	Set<String> m = driver.getWindowHandles();
	for(String o:m)
	{
	System.out.println(o);
		
	}
}


}

