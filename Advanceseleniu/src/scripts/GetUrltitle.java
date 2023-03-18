package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrltitle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(5000);
String url=driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
driver.quit();
}
}
