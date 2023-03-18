package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("pramod");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("c");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pramodgowda61@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pramod123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("pramod123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='register-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/computing-and-internet']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
	driver.quit();
	
	
}
}
