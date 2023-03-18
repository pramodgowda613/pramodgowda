package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;

public class Demoqawebtable {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("https://demoqa.com/webtables");
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("span[id='delete-record-1']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span[id='delete-record-2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("span[id='delete-record-3']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("pramod");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("c");
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("pramodgowda613@gmail.com");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='age']")).sendKeys("27");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2000");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='department']")).sendKeys("warehouse");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id='submit']")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("pramod");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("c");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("pramodgowda613@gmail.com");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='age']")).sendKeys("27");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2000");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='department']")).sendKeys("warehouse");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id='submit']")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id='addNewRecordButton']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("pramod");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='lastName']")).sendKeys("c");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("pramodgowda613@gmail.com");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='age']")).sendKeys("27");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='salary']")).sendKeys("2000");
Thread.sleep(1000);
driver.findElement(By.cssSelector("input[id='department']")).sendKeys("warehouse");
Thread.sleep(1000);
driver.findElement(By.cssSelector("button[id='submit']")).click();
Thread.sleep(1000);
driver.quit();
	}
	
}
