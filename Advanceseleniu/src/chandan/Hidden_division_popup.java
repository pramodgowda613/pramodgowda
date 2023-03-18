package chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_division_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Feb 2023']/../following-sibling::tr[4]/td[4]")).click();
		Thread.sleep(4000);
		
		driver.get("https://www.redbus.com/");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='date-box']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'February')]/../following-sibling::span/span[4]/div[4]")).click();
		Thread.sleep(4000);

		
		
		
		driver.quit();
		
	}	

}
