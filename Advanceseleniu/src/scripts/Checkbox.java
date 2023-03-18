package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Downloads/selena/check.html");
		Thread.sleep(2000);
		List<WebElement> check = driver.findElements(By.xpath("//input"));
		int count = check.size();
		System.out.println(count);
		for(WebElement x:check)
		{
			x.click();//for loop itself handle single element so it fetches you single element directly perform action on that
		}
		
		for(int i=count-1;i >=0;i--)
		{
	 check.get(i).click();//in order to perform click action we should use get() than perform action
		}
		
		}
			
		
}
