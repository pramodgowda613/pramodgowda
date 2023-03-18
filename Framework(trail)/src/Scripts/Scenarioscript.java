package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Genericscripts.Base_class;
import Genericscripts.Conversionss;
import Genericscripts.Javascriptss;
import Genericscripts.Selectdrop;
import Pomelements.Scenario;
@Listeners(Genericscripts.Listense.class)
public class Scenarioscript  extends Base_class   {
@Test
public void script() throws InterruptedException {
Scenario scp=new Scenario(driver);
scp.apparel().click();

WebElement d1 = scp.drop1();
Selectdrop.selectbyindex(d1, 1);//we can't extends static class only non static class we can extend

WebElement d2 = scp.drop2();
Selectdrop.selectbyvisible(d2, no);
WebElement D3 = scp.drop3();
Selectdrop.selectbyvisible(D3, value);

Javascriptss.schll(scp.addcat2());
scp.addcat1().click();
Thread.sleep(1000);  ///this is main script i am just calling performing
scp.addcat2().click();
Thread.sleep(1000);
scp.addctclk().click();
String p1 = scp.price1().getText();   //alt+shift+l
String p2 = scp.price2().getText();
double v1 = Conversionss.conver(p1);
double v2 = Conversionss.conver(p2);
if(v1>v2)
{
	scp.chekck1().click();
	scp.adoch3().click();
	scp.chout().click();	
}
else
{
	scp.chekc2().click();
	scp.adoch3().click();
	scp.chout().click();
}
}
}




