package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Playsong {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	Thread.sleep(2000);
	driver.findElement(By.name("search_query")).sendKeys("kgf chapter 2");
	Thread.sleep(2000);
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Toofan Video Song (Kannada) | KGF Chapter 2 | RockingStar Yash |Prashanth Neel |Ravi Basrur|Hombale")).click();
	driver.quit();
	
}
	
}
