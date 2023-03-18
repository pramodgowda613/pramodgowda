package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(2000);
	/*
driver.get("C:\\Users\\Dell\\Downloads\\selena\\Filedownload.html");
WebElement d = driver.findElement(By.id("f1"));
Thread.sleep(2000);
d.sendKeys("C:\\Users\\Dell\\Downloads\\selena\\Filedownload.html");

*/
	/*
	driver.get("https://www.selenium.dev/downloads/");
	Thread.sleep(21000);//manualy change to download settings
	driver.findElement(By.xpath("//a[text()='4.8.0']")).click();
	Thread.sleep(2000);
	Robot a=new Robot();
	a.keyPress(KeyEvent.VK_ENTER);
	a.keyRelease(KeyEvent.VK_ENTER);
	*/
	
	Robot a=new Robot();
	a.keyPress(KeyEvent.VK_ALT);
	a.keyPress(KeyEvent.VK_SPACE);
	a.keyPress(KeyEvent.VK_N);
	
	a.keyRelease(KeyEvent.VK_ALT);
	a.keyRelease(KeyEvent.VK_SPACE);
	a.keyRelease(KeyEvent.VK_N);
	
	Thread.sleep(2000);
	driver.manage().window().maximize();
	
	
	

}
}
