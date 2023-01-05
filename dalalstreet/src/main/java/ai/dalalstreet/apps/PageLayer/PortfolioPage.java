package ai.dalalstreet.apps.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.dalalstreet.apps.TestBase.TestBase;

public class PortfolioPage extends TestBase {
	
	public PortfolioPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Portfolio']")
	private WebElement portfolio;
	
	@FindBy(xpath ="(//a[text()='Trade'])[1]")
	private WebElement Trade;
	

	
	public void clickPortfolio() {
		portfolio.click();
	}
	
	public void clickTrade() {
		Trade.click();
	}
}
