package scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURl {
	
public static void main(String[] args) throws InterruptedException 
	 {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	String s=driver.getCurrentUrl();
	System.out.println(s);
	String ss=driver.getTitle();
	System.out.println(ss);
	driver.get("https://www.facebook.com");
	
Thread.sleep(1000);
	driver.quit();
}
}
