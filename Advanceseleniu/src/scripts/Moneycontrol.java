package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Moneycontrol {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(2000);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	WebElement a = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Most Active']/../../../div[2]/div[2]/table/tbody/tr[1]/td[1]/a"))));
	String ss = a.getText();
	System.out.println(ss);
	WebElement d = driver.findElement(By.xpath("((//a[@title='Top Gainers'])[2]/../../../div[2]/div[2]/table/tbody/tr/td/a)[1]"));
	String s = d.getText();
	System.out.println(s);
	WebElement r = driver.findElement(By.xpath("((//a[@title='Top Losers'])[2]/../../../div[2]/div[2]/table/tbody/tr/td/a)[1]"));
	String rr = r.getText();
	System.out.println(rr);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//input[@id='search_str'])[1]")))).sendKeys("infy");
	driver.findElement(By.xpath("(//a[@title='Submit'])[1]")).click();
	
	WebElement infi = driver.findElement(By.xpath("//h1[text()='Infosys Ltd.']/../../../../div[4]/div[1]/div/div[1]/div/div[1]/div[2]"));
	String info = infi.getAttribute("data-numberanimate-value");
	System.out.println(info);
	}
}
