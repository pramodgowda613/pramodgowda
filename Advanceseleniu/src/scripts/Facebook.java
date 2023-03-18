package scripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
//	driver.findElement(By.tagName("input")).sendKeys("pramod");
//	Thread.sleep(3434);
//	driver.findElement(By.id("hello")).sendKeys("yaro ivnu");
//	Thread.sleep(2000);
//	driver.findElement(By.name("hi")).click();
//	Thread.sleep(1000);
//	driver.findElement(By.name("YouTube")).click();
	Thread.sleep(6000); 
	Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\FB.exe");
	Thread.sleep(4000);
	driver.quit();

}
}
