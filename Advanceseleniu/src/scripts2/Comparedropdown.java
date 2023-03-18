package scripts2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Comparedropdown {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Downloads/selena/Drop.html");
	Thread.sleep(2000);
	WebElement d1 = driver.findElement(By.xpath("//select[@id='city']"));
	Select d=new Select(d1);
	List<WebElement> h = d.getOptions();
	
	WebElement d2 = driver.findElement(By.xpath("//select[@id='car']"));
	Select e=new Select(d2);
	List<WebElement> m = e.getOptions();
	
	for(WebElement i:h)
	{
		String l = i.getText();
		for(WebElement t:m)
		{
			String q = t.getText();
			if(l.equals(q))
			{
				System.out.println(l);
			}
		}
	}
	
}
}
