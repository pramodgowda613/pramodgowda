package scripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowclose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();// getwindowhandle used to get address of current browser 
	Thread.sleep(2000);
		/*
		String f = driver.getWindowHandle();
		Set<String> d = driver.getWindowHandles();
		for(String fd:d)
		{
			driver.switchTo().window(fd);
			Thread.sleep(2000);
			if(f.equals(fd))//to close parent browser
			{
			driver.close();//applying condition for close() says if parent browser address matches than close only 
		}
		}
		*/
		/*
		String f = driver.getWindowHandle();
		Set<String> d = driver.getWindowHandles();
		for(String fd:d)
		{
			driver.switchTo().window(fd);
			Thread.sleep(2000);
			if(f.equals(fd))
			{
				String r = driver.getTitle();//to close child browser
				System.out.println(r);
			}
			else
			{
				driver.close();
			}
	}
*/
	/*
	 Set<String> d = driver.getWindowHandles();
for(String t:d)
{
	driver.switchTo().window(t); //to get 2 window title
	String m = driver.getTitle();
	System.out.println(m);
}
*/
	Set<String> g = driver.getWindowHandles();
	for(String j:g)
	{
		System.out.println(j);//to get 2 windows id
	}
}
}

		