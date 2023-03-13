package Genericscripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Screnshot extends Base_class{
	
public static void photo(WebDriver driver,ITestResult result)
{
	Date dat=new Date();
	String d = dat.toString().replaceAll(":", "-");
	
	TakesScreenshot shot=(TakesScreenshot)driver;
	File temp = shot.getScreenshotAs(OutputType.FILE);
	File pem=new File(phot+d);
	try {
		FileHandler.copy(temp, pem);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
