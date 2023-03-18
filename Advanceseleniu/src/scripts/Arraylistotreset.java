package scripts;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Arraylistotreset {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/selena/city.html");
		WebElement rr = driver.findElement(By.id("city"));
		Select ne=new Select(rr);
		List<WebElement> red = ne.getOptions();
		TreeSet<String> b=new TreeSet<String>();
		for(WebElement rrr:red)
		{
			String f = rrr.getText();
			b.add(f);
		}
		ArrayList<String> mm=new ArrayList<String>(b);
		for(String p:mm)
		{
			System.out.println(p);
		}
}
}
