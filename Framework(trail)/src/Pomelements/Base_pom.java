package Pomelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Base_pom {

	public Base_pom(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	}
}
