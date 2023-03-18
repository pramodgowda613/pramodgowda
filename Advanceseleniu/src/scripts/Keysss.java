package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysss {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	WebElement d=driver.findElement(By.xpath("//input[@type='text']"));
	d.sendKeys("334");
	Thread.sleep(2000);
	d.sendKeys(Keys.CONTROL+"a" , Keys.BACK_SPACE);
	
		

}
}