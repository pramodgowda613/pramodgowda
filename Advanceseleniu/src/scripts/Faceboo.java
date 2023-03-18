package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Faceboo {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.name("email")).sendKeys("pramodgowda613@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("9901057429");
	driver.findElement(By.name("login")).click();
	driver.quit();
	
}
}
