package scripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revision {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 Thread.sleep(1000);
	 /*
	Point p=new Point(200, 400);
	driver.manage().window().setPosition(p);
	Dimension d=new Dimension(200, 430);
	driver.manage().window().setSize(d);
	*/
	    
	    
}
}
