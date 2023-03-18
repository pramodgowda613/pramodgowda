package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("24df");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	WebElement text = driver.findElement(By.xpath("//div[contains(text(),'address')]"));
String full = text.getText();	
System.out.println(full);
driver.quit();

}
}
	
