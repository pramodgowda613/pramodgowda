package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelike {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(8000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("gilli tamil movie songs");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@title='Kokkara Kokkarako - Video Song | Ghilli | Thalapathy Vijay | Trisha | Vidyasagar | Sun Music']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@id='segmented-like-button']")).click();
	driver.quit();
}
}
