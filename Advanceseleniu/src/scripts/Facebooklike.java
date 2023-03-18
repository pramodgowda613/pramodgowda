package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklike {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9071952586");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@aria-label='Search Facebook']")).sendKeys("suresh raina");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()=' Raina']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Follow']")).click();
	driver.quit();
	
	}
	
}
