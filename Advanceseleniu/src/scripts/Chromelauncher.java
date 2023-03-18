package scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chromelauncher {
public static void main(String[] args) {
	String key="webdriver.chrome.driver";
	String value="./software/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
	driver.quit();
}
}
