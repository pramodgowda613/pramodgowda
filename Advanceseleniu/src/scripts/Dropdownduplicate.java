package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownduplicate {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Dell/Downloads/selena/city.html");
	WebElement city = driver.findElement(By.id("city"));
	WebElement car = driver.findElement(By.id("car"));
	Select city1=new Select(city);
	Select car1=new Select(car);
	List<WebElement> c = city1.getOptions();
	List<WebElement> ce = car1.getOptions();
	for(WebElement cc:c)
	{
		String s=cc.getText();
		for(WebElement ca:ce)
		{
			String cf=ca.getText();
			if(s.equals(cf))
			{
				
				System.out.println(s);
			}
			else
			{
				System.out.println("no");
			}
		}
	}
	
}
}
