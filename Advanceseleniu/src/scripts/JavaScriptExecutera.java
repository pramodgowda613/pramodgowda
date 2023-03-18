package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutera {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	/*
	driver.get("file:///C:/Users/Dell/Downloads/selena/Javascriptexute.html");
	jse.executeScript("document.getElementById('a1').value='3000'");
	*/
	
	/*
	driver.get("file:///C:/Users/Dell/Downloads/selena/Javascriptexute.html");
	jse.executeScript("document.getElementById('a1').value=''");88
	*/
	
	/*
	driver.get("https://www.amazon.in/");
	for (int i = 0; i <=3; i++) {
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
	}
	for (int i = 0; i <=3; i++) {
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)");
	}
	*/
driver.get("https://www.amazon.in/");
WebElement red = driver.findElement(By.xpath("//a[text()='About Us']"));
Point a = red.getLocation();
System.out.println(a);
int bb = a.getX();
int dd = a.getY();
System.out.println(bb+dd);
jse.executeScript("window.scrollBy("+bb+","+dd+")");


}
}
