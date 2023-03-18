package scripts;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	TakesScreenshot screen=(TakesScreenshot) driver;
	File re = screen.getScreenshotAs(OutputType.FILE);
	File rs=new File("./Screenshot/f.jpeg");
	org.openqa.selenium.io.FileHandler.copy(re, rs);//create folder than refresh than open with system editor
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("200");
	

}
}