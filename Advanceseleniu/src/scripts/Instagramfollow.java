package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramfollow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("9071952586");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
	Thread.sleep(12000);
	driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("punithrajkumar");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='punith raj kumar  00official']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Follow']")).click();
	driver.quit();
	
	
}
}
