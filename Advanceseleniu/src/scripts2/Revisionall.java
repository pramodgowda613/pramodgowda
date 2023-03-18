package scripts2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Condition;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Revisionall {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		TakesScreenshot shot=(TakesScreenshot) driver;
		driver.navigate().to("https://www.google.com/search?q=gmail&rlz=1C1CHBD_enIN1018IN1018&oq=&aqs=chrome.5.35i39i362l8.1122010229j0j15&sourceid=chrome&ie=UTF-8");
		
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//span[text()=' › mail'])[1]")))).click();
	File a = shot.getScreenshotAs(OutputType.FILE);
		File b=new File("./Screenshot/how.jpeg");
	FileHandler.copy(a, b);
	
	}
	
}
