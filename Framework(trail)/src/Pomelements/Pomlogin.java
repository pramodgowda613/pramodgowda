package Pomelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomlogin extends Base_pom {
	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement button;

	private WebElement logout;

	 public Pomlogin(WebDriver driver)  
	{
		super(driver);
	}
	  
	public WebElement loin()
	{
		return login;
	}
	public WebElement emil()
	{
		return email;
	}
	public WebElement pasword()
	{
		return password;
	}
	public WebElement buton()
	{
		return button;
	}
	public WebElement loggout()
	{
		return logout;
	}


	}


