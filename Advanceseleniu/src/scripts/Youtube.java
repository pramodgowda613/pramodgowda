package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Youtube {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(1000);
	driver.findElement(By.name("search_query")).sendKeys("kgf chapter 2");
	Thread.sleep(1000);
	driver.findElement(By.id("search-icon-legacy")).click();
	driver.quit();
	
}
}
