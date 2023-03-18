package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Passthevaluebyjavascript {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	/*
	WebElement d = driver.findElement(By.xpath("//input[@type='text']"));
	WebElement s = driver.findElement(By.xpath("//input[@type='password']"));
	WebElement a = driver.findElement(By.xpath("//button[@name='login']"));
	jse.executeScript("arguments[0].value='have'",d);
	Thread.sleep(2000);
	jse.executeScript("arguments[0].value='redd'",s);
	Thread.sleep(2000);
	jse.executeScript("arguments[0].click();",a);
	*/
	/*
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	Thread.sleep(2000);
	WebElement g = driver.findElement(By.xpath("//input[@name='custom_gender']"));
	jse.executeScript("arguments[0].value='ghee'",g);
	Thread.sleep(2000);
	WebElement ht = driver.findElement(By.xpath("(//input[@name='sex'])[3]"));
	jse.executeScript("arguments[0].click();",ht);
	*/
	
	
	
	
}
}