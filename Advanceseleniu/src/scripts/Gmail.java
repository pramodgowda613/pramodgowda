package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/accountchooser/identifier?checkedDomains=youtube&continue=https%3A%2F%2Fmail.google.com&dsh=S-1476230849%3A1673585878958564&flowEntry=AccountChooser&flowName=GlifWebSignIn&hl=en&ifkv=AeAAQh5m2SrMkqR39t1ZBp7LLr4GN8IDkXL3hOQlcx_UXcr0Z98eImwhs0Vwa1jgl-ROb1NIaXXFlQ&pstMsg=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pramodgowda613@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Try again']")).click();
		driver.quit();
	}

}
