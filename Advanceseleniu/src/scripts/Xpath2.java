package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/login']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pramodgowda61@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("pramod123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@src='https://demowebshop.tricentis.com/content/images/thumbs/0000130_computing-and-internet_125.jpeg']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@id='add-to-cart-button-13']")).click();
driver.quit();
}
}
