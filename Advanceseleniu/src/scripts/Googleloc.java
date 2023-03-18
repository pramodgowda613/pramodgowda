package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googleloc {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.co.in/maps/@13.038709,77.4289403,14z?hl=en");
Thread.sleep(4000);
driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@tooltip='Choose starting point, or click on the map...']")).sendKeys("malleswaram");
Thread.sleep(4000);
driver.findElement(By.xpath("(//button[@data-tooltip='Search' and @aria-label='Search'])[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@tooltip='Choose destination, or click on the map...']")).sendKeys("sunkadakatte");
Thread.sleep(2000);
driver.findElement(By.xpath("(//button[@aria-label='Search' and @data-tooltip='Search'])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Details']")).click();
driver.quit();

}
}
