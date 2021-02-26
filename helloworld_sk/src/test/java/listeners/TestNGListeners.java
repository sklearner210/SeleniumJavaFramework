package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
	System.out.println("Test started :"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test onTestSuccess :"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test onTestFailure :"+result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestSkipped :"+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestFailedButWithinSuccessPercentage :"+result.getName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test onTestFailedWithTimeout :"+result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onStarted :"+context.getName());
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Test onFinish :"+context.getName());
	}
	
	
	
	

}
