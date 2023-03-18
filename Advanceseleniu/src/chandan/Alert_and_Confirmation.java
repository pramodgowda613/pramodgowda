package chandan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_and_Confirmation {


		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			Thread.sleep(2000);
			driver.findElement(By.name("cusid")).sendKeys("chandu");
			Thread.sleep(2000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			System.out.println(text);
			alt.accept();
			Thread.sleep(4000);
			driver.quit();

	}

}
