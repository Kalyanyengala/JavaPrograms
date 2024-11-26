package TestNGWorkSpace;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class Listeners_Implemented implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Printing onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Printing onTestSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Printing onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Printing onTestSkipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Printing onStart");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Printing onFinish");
	}
	
	
}
