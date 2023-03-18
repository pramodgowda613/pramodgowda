package chandan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_E_E {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("chandan");
Thread.sleep(2000);
WebElement gs = driver.findElement(By.xpath("//img[@alt='Google']/../../following-sibling::div[1]/form/div[1]/div[1]/div[4]/center/input[1]"));
	}
}
