package scripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demodrpdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("pramodgowda613@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("9901057429");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//strong[text()='Categories']/../../div[2]/ul/li[4]/a")).click();
	Thread.sleep(2000);
	WebElement a1 = driver.findElement(By.xpath("//select[@id='products-orderby']"));
	Select d=new Select(a1);
	d.selectByVisibleText("Name: A to Z");
	Thread.sleep(2000);
	WebElement red = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
	Select fg=new Select(red);
	fg.selectByVisibleText("12");
	Thread.sleep(2000);
	WebElement dd = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
	Select n=new Select(dd);
	n.selectByVisibleText("List");
	List<WebElement> gt = driver.findElements(By.xpath("//span[@class='price actual-price']"));
	
	for(WebElement dde:gt)
		
	{
		String dt = dde.getText();
		System.out.println(dt);
		
	}
	
	
}
}
