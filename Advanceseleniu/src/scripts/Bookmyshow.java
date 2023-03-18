package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://in.bookmyshow.com/explore/home/bengaluru");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//img[@alt='Pathaan']")). click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("(//span[text()='Book tickets'])[1]")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//span[text()='2D']")).click();
	Thread.sleep(16000);
	driver.findElement(By.xpath("//li[@data-name='Abhinay Theatre 4K A/C: Gandhinagar']/div[2]/div[2]/div[5]/a")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	Thread.sleep(8000);
	WebElement book = driver.findElement(By.xpath("(//td[@class='SRow1'])[1]/div[8]/a"));
book.click();
Thread.sleep(2000);
if(book.isEnabled())
{
	System.out.println("selected");
}
else
{
	System.out.println("not selected");
	driver.quit();
}
}
}
