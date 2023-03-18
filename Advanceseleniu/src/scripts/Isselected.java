package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D9062064%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-eT1va7V_AIVgJlmAh3o1Q1eEAAYASAAEgJxZ_D_BwE");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("pramod");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("c");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9901057429");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9901057428");
Thread.sleep(2000);
WebElement btn = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
btn.click();
Thread.sleep(2000);
if(btn.isSelected())
{
	System.out.println("selected");
	
}
else
{
	System.out.println("not selected");
	driver.quit();
}
}
}
