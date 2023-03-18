package Genericscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptss extends Base_class{
	
public static JavascriptExecutor scroll()
{
	
	JavascriptExecutor exe=(JavascriptExecutor)driver;
	return exe;

}
public static void schll(WebElement ele)
{
	scroll().executeScript("arguments[0].scrollIntoView();", ele);  // if you want to access anything make it static variable/method
	
}

public static void scrolby(int x,int y)
{
	scroll().executeScript("window.scrollBy("+x+","+y+")");
}

}


