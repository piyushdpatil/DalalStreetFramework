package ai.dalalstreet.apps.TestLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import ai.dalalstreet.apps.TestBase.TestBase;

public class BuyFunctionalityTest extends TestBase {

	@Test
	public void verifyBuyFunctionality() throws InterruptedException {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		dashboard.enterInSearchBox("wipro");
		dashboard.clickSelectCompany();
		Thread.sleep(5000);
		 logger.info("Go to dashboard and search Company");
		exchange.clickOnBuyBtn1();
		
		exchange.clickBuyDurLongTerm();
		
		exchange.clickBuyPtypeMarket();
		exchange.enterBuyQuantity("2");
		Thread.sleep(3000);
		 
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.clickonBuyBtn2();
		logger.info("select category, quentity, and buy stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getMStatus();
		String ExpectedResult = "Order Created successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}
	
	@Test
	public void verifyByFunctinalityWithLTandCL() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		dashboard.enterInSearchBox("wipro");
		dashboard.clickSelectCompany();
		Thread.sleep(5000);
		logger.info("Go to dashboard and search Company");
		exchange.clickOnBuyBtn1();
		exchange.clickBuyDurLongTerm();
		 
		exchange.clickBuyPtypeCustmLimit();
		Thread.sleep(1000);
		exchange.enterBuyQuantity("2");
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterBuyCustLimitTxt("390");
		
		Thread.sleep(3000);
		exchange.clickonBuyBtn2();
		logger.info("select category, quentity, and buy stockes");
		Thread.sleep(2000);
		String actualResult = exchange.getCLstate();
		String ExpectedResult = "Limit Order Created Successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}
	@Test
	public void verifyByFunctinalityWithIntradayandMarket() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		dashboard.enterInSearchBox("wipro");
		dashboard.clickSelectCompany();
		Thread.sleep(5000);
		logger.info("Go to dashboard and search Company");
		exchange.clickOnBuyBtn1();
		exchange.clickBuyDurIntraday();
		exchange.clickBuyPtypeMarket();
		Thread.sleep(1000);
		exchange.enterBuyQuantity("2");
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.clickonBuyBtn2();
		logger.info("select category, quentity, and buy stockes");
		Thread.sleep(3000);
		String actualResult = exchange.getIMStatus();
		String ExpectedResult = "Order Created Successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}
	
	@Test
	public void verifyByFunctinalityWithIntradayandCL() throws InterruptedException {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		dashboard.enterInSearchBox("wipro");
		dashboard.clickSelectCompany();
		Thread.sleep(5000);
		logger.info("Go to dashboard and search Company");
		exchange.clickOnBuyBtn1();
		exchange.clickBuyDurIntraday();;
		 
		exchange.clickBuyPtypeCustmLimit();
		Thread.sleep(1000);
		exchange.enterBuyQuantity("2");
		js.executeScript("scrollBy(0,300)");
		Thread.sleep(3000);
		exchange.enterBuyCustLimitTxt("390");
		
		Thread.sleep(3000);
		exchange.clickonBuyBtn2();
		logger.info("select category, quentity, and buy stockes");
		Thread.sleep(2000);
		String actualResult = exchange.getCLstate();
		String ExpectedResult = "Limit Order Created Successfully";
		System.out.println(actualResult);
		Assert.assertEquals(actualResult, ExpectedResult);
	}

}

//try {
//	Thread.sleep(5000);
//} catch (Exception e) {
//	
//	e.printStackTrace();
//	JavascriptExecutor js = ((JavascriptExecutor)driver);
//	js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'Buy')]")));
//}
//
//
//JavascriptExecutor js = ((JavascriptExecutor)driver);
//js.executeScript("document.body.style.zoom = '0.7'");
////Point p = exchange.buyBtn3.getLocation();
////int x =p.getX();
////int y = p.getY();
////System.out.println(x +","+y);
//
//
////	js.executeScript("scrollBy("+x+","+y+")");