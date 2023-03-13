package Genericscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pomelements.Pomlogin;

public class Base_class implements Framework_constants {
	ExtentHtmlReporter rep;
	ExtentReports reprt;
	 public ExtentTest start;
	 public static  WebDriver driver;//make public to get access in another package
	public static Pomlogin ele;
	FileInputStream fil;
	Properties prop;
	String url;
	public static String phot;
	
@BeforeTest
public void repconfig() throws IOException
{
 rep=new ExtentHtmlReporter(path);
 reprt=new ExtentReports();
reprt.attachReporter(rep);
 start = reprt.createTest("nande");//once you declare in global don't mention here only put reference variable(if not null pointer exception will get)
 fil=new FileInputStream(file);
Properties prop=new Properties();
prop.load(fil);
 url = prop.getProperty("url");
 phot = prop.getProperty("phot");
}

@BeforeClass
public void openbrowser()
{
	System.setProperty(chrome_key,chrom_value);
	 driver=new ChromeDriver();
	start.log(Status.INFO, "wowo");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}

@BeforeMethod
public  void login()
{
driver.get(url);
start.log(Status.INFO, "app lauched");
	  ele = new Pomlogin(driver);
	ele.loin().click();
	ele.emil().sendKeys(un);
	ele.pasword().sendKeys(pass);
	ele.buton().click();
	
}
@AfterMethod
public  void logout()
{
	ele.loggout().click();
	start.log(Status.INFO, "app loggout");
	}
@AfterClass
public void closeapp()
{
	driver.quit();
	start.log(Status.INFO, "close");
	
}

}


