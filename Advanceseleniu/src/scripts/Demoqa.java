package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqa {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demoqa.com/text-box");
	Thread.sleep(6000);
	driver.findElement(By.cssSelector("input[id='userName']")).sendKeys("pramod");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("pramodgowda613@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("textarea[id='currentAddress']")).sendKeys("rajajinagar");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("textarea[id='permanentAddress']")).sendKeys("karnataka");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[id='submit']")).click();
	driver.quit();
}
}
