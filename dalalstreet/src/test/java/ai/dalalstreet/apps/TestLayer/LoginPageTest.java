package ai.dalalstreet.apps.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import ai.dalalstreet.apps.PageLayer.LoginPage;
import ai.dalalstreet.apps.TestBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void VerifyLogin() throws InterruptedException {
		
		String actuleResult = driver.getCurrentUrl();
		String expectedResult="https://apps.dalalstreet.ai/dashboard";
		Assert.assertEquals(actuleResult, expectedResult);
	}

	
}
