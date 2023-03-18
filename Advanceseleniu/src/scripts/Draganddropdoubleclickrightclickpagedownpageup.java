package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddropdoubleclickrightclickpagedownpageup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		WebElement d = driver.findElement(By.xpath("(//div[text()='Madrid'])[2]"));
		WebElement r = driver.findElement(By.xpath("//div[@id='box107']"));
		Actions dr=new Actions(driver);
		dr.dragAndDrop(d, r).perform();
		*/
		
		/*
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
	
		WebElement dr = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		act.doubleClick(dr).perform();
		
	*/
		/*
		WebElement de = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions acts=new Actions(driver);
		acts.contextClick(de).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();//control backslash used inorder to freeze the screen then get java script used elements handling where go to sourcecode-select element-then ctrl+\
		*/
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
	}

}
