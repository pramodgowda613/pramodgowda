package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Passthedata {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Dell/Downloads/selena/red.html");
	driver.findElement(By.tagName("input")).sendKeys("hello");
	driver.findElement(By.tagName("input")).sendKeys("good");
driver.quit();


}
}
