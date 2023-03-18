package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reviewmobile {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/books");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("pramodgowda613@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@title='Show products in category Cell phones']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Picture of Smartphone']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Add your review']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@class='review-text']")).sendKeys("wow goood product");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='addproductrating_4']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='review-title']")).sendKeys("nande");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='add-review']")).click();
	driver.quit();
}
}
