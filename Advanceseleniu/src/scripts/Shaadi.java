package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shaadi {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shaadi.com/");
	Thread.sleep(2000);
driver.findElement(By.xpath("//a[@data-testid='login_link']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@data-testid='login_email']")).sendKeys("pramod");
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@data-testid='login_password']")).sendKeys("pammu");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[@data-testid='sign_in']")).click();
driver.quit();
}
}
