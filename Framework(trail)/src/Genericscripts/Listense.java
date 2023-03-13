package Genericscripts;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listense extends Base_class implements ITestListener  {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("lauched"+result.getName());    
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("sucess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("failed check"+result.getName());
		Screnshot.photo(driver, result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped why");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("amazing");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("its good");
	}

}
