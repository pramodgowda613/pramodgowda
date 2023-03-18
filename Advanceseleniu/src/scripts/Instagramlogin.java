package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Instagramlogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9071952586");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("9901057429");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.quit();
	}

}
