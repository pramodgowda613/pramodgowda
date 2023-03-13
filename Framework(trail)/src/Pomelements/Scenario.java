package Pomelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario  extends Base_pom {
@FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[4]")
private WebElement shoe;

@FindBy(xpath = "//select[@id='products-orderby']")
private WebElement dp1;

@FindBy(xpath = "//select[@id='products-pagesize']")
private WebElement dp2;

@FindBy(xpath = "//select[@id='products-viewmode']")
private WebElement dp3;

@FindBy(xpath = "//a[text()='Blue Jeans']/../following-sibling::div[3]/div[2]/input")
private WebElement addtocart1;

@FindBy(xpath = "//a[text()='Blue and green Sneaker']/../following-sibling::div[3]/div[2]/input")
private WebElement addtocart2;

@FindBy(xpath = "//span[text()='Shopping cart']")
private WebElement adtocrt;

@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[6]/span[2]")
private WebElement price1;

@FindBy(xpath ="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
private WebElement price2;

@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[1]/input")
private WebElement ch1;

@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[1]/input")
private WebElement ch2;

@FindBy(id = "termsofservice")
private WebElement addch3;

@FindBy(xpath = "//button[@id='checkout']")
private WebElement checkout;

public Scenario(WebDriver driver) {
super(driver);
}
 public WebElement apparel()
 {
	 return shoe;
 }

 public WebElement drop1()
 {
	 return dp1;
 }
 public WebElement drop2()
 {
	 return dp2;
 }
 public WebElement drop3()
 {
	 return dp3;
 }
 public WebElement addcat1()
 {
	 return addtocart1;
 }
 public WebElement addcat2()
 {
	 return addtocart2;
 }
 public WebElement addctclk()
 {
	 return adtocrt;
 }
 public WebElement price1()
 {
	 return price1;
 }
 public WebElement price2()
 {
	 return price2;
 }
 public WebElement chekck1()
 {
	 return ch1;
 }
 public WebElement chekc2()
 {
	 return ch2;
 }
 public WebElement adoch3()
 {
	 return addch3;
 }
 public WebElement chout()
 {
	 return checkout;
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
