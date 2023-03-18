package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fiveapps {
	public static void main(String[] args) throws InterruptedException    {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String title=driver.getTitle();
	System.out.println(title);
	driver.get("https://www.facebook.com");
	String fc=driver.getCurrentUrl();
	System.out.println(fc);
	String fcc=driver.getTitle();
	System.out.println(fcc);
	driver.get("https://www.amazon.com");
	String ami=driver.getCurrentUrl();
	System.out.println(ami);
String amii=driver.getTitle();
System.out.println(amii);
driver.get("https://www.redbus.com");
String red=driver.getCurrentUrl();
System.out.println(red);
String redd=driver.getTitle();
System.out.println(redd);
driver.get("https://www.abhibus.com");
String abhi=driver.getCurrentUrl();
System.out.println(abhi);
String abhii=driver.getTitle();
System.out.println(abhii);
driver.quit();

	}

}
