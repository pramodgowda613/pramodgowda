package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pricematching {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Google Pixel 7 Pro (Hazel, 128 GB)  (12 GB RAM)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	WebElement price = driver.findElement(By.xpath("//div[text()='Google Pixel 7 Pro (Hazel, 128 GB)']/../../div[2]/div[1]/div[1]/div[1]"));
	String s = price.getText().replace("₹", "").replace(",", "");
	System.out.println("flipkart price"+s);
	
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Google Pixel 7 Pro (Hazel, 128 GB)  (12 GB RAM)");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	Thread.sleep(2000);
	WebElement pri = driver.findElement(By.xpath("//span[text()='Google Pixel 7 Pro (Snow, 128 GB) (12 GB RAM)']/../../../../div[3]/div[1]/div/div[1]/div/a/span[2]"));

	String ama = pri.getText().replace("₹", "").replace(",", "");
	System.out.println("amazon price"+ama);
	double flipkart = Double.parseDouble(s);
	double amazon = Double.parseDouble(ama);
	if(flipkart>amazon)
	{
		System.out.println("flipkart price is more than amazon");
	}
	else
	{
	System.out.println("amazon price is compare to flipkart");
	}
	driver.quit();
}
}
