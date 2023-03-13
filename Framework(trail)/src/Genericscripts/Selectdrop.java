package Genericscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectdrop 
{

public static Select drop(WebElement ele)
{

	Select sel=new Select(ele);
	return sel;
}

public static void selectbyindex(WebElement ele,int index)// if we make it as static we can access in another class
{
	drop(ele).selectByIndex(index);
}
public static void selectbyval(WebElement ele,String value)
{
	drop(ele).selectByValue(value);
}
public static void selectbyvisible(WebElement ele,String value)
{
	
	drop(ele).selectByVisibleText(value);
}

	
}




