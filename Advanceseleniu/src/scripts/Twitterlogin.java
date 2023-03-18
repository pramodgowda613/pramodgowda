package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitterlogin {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@name='text']")).sendKeys("pramodgowda613@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@data-testid='LoginForm_Login_Button']")).click();
	driver.quit();
}
}
