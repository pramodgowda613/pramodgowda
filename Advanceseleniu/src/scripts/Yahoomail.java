package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoomail {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pramodpammu92");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("8217028176");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("pramodgowda16@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("dummy mail sending");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("hello everyone "
			+ "its me pramod");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@title='Send this email']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='  pramod ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='pure-button puree-button-link add-account page-button-link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("pramodgowda16");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-test-folder-name='Inbox']")).click();
	driver.quit();
	
}
}
