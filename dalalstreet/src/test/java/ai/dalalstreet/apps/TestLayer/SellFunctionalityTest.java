package ai.dalalstreet.apps.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import ai.dalalstreet.apps.TestBase.TestBase;

public class SellFunctionalityTest extends TestBase {

	@Test

	public void verifySellFunctionalityLTandMarket() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		potfolio.clickPortfolio();
		Thread.sleep(5000);
		potfolio.clickTrade();
		logger.info("Go to portfolio page and click on trade");
		Thread.sleep(5000);

		exchange.clickOnSellBtn1();
		Thread.sleep(2000);
		exchange.clickSellDurLongTerm();
		exchange.clickSellPtypeMarket();
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterSellQuantity("3");

		Thread.sleep(3000);
		exchange.clickonSellBtn2();
		logger.info("select category, quentity, and Sell stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getMStatus();
		String ExpectedResult = "Order Created successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}

	@Test

	public void verifySellFunctionalityLTandCL() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		potfolio.clickPortfolio();
		Thread.sleep(5000);
		potfolio.clickTrade();
		logger.info("Go to portfolio page and click on trade");
		Thread.sleep(5000);

		exchange.clickOnSellBtn1();
		Thread.sleep(2000);
		exchange.clickSellDurLongTerm();
		exchange.clickSellPtypeCustmLimit();
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterSellCustLimitTxt("395");
		Thread.sleep(3000);
		exchange.enterSellQuantity("3");

		Thread.sleep(3000);
		exchange.clickonSellBtn2();
		logger.info("select category, quentity, and Sell stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getCLstate();
		String ExpectedResult = "Limit Order Created Successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}

	@Test

	public void verifySellFunctionalityIntradayandMarket() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		potfolio.clickPortfolio();
		Thread.sleep(5000);
		potfolio.clickTrade();
		logger.info("Go to portfolio page and click on trade");
		Thread.sleep(5000);

		exchange.clickOnSellBtn1();
		Thread.sleep(2000);
		exchange.clickSellDurIntraday();
		exchange.clickSellPtypeMarket();
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterSellQuantity("3");

		Thread.sleep(3000);
		exchange.clickonSellBtn2();
		logger.info("select category, quentity, and Sell stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getMStatus();
		String ExpectedResult = "Order Created successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}

	@Test

	public void verifySellFunctionalityIntradayandCL() throws InterruptedException {
		JavascriptExecutor js = ((JavascriptExecutor) driver);

		potfolio.clickPortfolio();
		Thread.sleep(5000);
		potfolio.clickTrade();
		logger.info("Go to portfolio page and click on trade");
		Thread.sleep(5000);

		exchange.clickOnSellBtn1();
		Thread.sleep(2000);
		exchange.clickSellDurIntraday();
		exchange.clickSellPtypeCustmLimit();
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterSellCustLimitTxt("395");
		Thread.sleep(3000);
		exchange.enterSellQuantity("3");

		Thread.sleep(3000);
		exchange.clickonSellBtn2();
		logger.info("select category, quentity, and Sell stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getCLstate();
		String ExpectedResult = "Limit Order Created Successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}
}
