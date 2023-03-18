package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Googl {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Downloads/selena/dummy.html");
	Thread.sleep(1000);
	driver.findElement(By.tagName("input")).sendKeys("pra");
	Thread.sleep(1000);
	driver.findElement(By.id("hi")).sendKeys("error");
	Thread.sleep(1000);
	driver.findElement(By.name("YouTube")).click();
	driver.findElement(By.name("q")).sendKeys("love");
	driver.findElement(By.name("btnK")).click();
	driver.quit();
}
}
