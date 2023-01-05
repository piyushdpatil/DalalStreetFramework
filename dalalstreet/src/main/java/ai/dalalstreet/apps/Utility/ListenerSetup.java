package ai.dalalstreet.apps.Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import ai.dalalstreet.apps.TestBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		logger.info(" Execution Stared."+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Case Executed Successfully."+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Case Execution Failed."+ result.getName());
		
		UtilClass.takeScreenShot(result.getName()+System.currentTimeMillis());
		logger.info("Screen Shot");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Case Execution Skipped."+ result.getName());
	}


}
