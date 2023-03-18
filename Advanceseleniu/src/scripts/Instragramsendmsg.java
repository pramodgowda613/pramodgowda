package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Instragramsendmsg {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://www.instagram.com/");
	Thread.sleep(6000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramodgowda613@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7829878946");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(35000);
	driver.findElement(By.xpath("//div[@class='_acuq _acur']/div/div[2]/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[text()='Manjunath M K Manju']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@placeholder='Message...']")).sendKeys("hi bow");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Send']")).click();
	driver.quit();
	
}
}
