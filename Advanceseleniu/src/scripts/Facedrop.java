package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facedrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	WebElement dr = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select drop=new Select(dr);
	drop.selectByIndex(15);
	Thread.sleep(2000);
	WebElement mon = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select month=new Select(mon);
	month.selectByValue("12");
	Thread.sleep(2000);
WebElement yea = driver.findElement(By.xpath("//select[@name='birthday_year']"));
Select year=new Select(yea);
year.selectByVisibleText("1996");
	}}
