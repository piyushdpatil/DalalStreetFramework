package ai.dalalstreet.apps.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ai.dalalstreet.apps.TestBase.TestBase;

public class ExchangePage extends TestBase {

	public ExchangePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[contains(text(),'Buy')]")
	private WebElement buyBtn1;

	@FindBy(xpath = "//a[contains(text(),'Sell')]")
	private WebElement sellBtn1;

	@FindBy(xpath = "(//label[text()='Long-term'])[2]")
	private WebElement sell_dur_long_term;

	@FindBy(xpath = "(//label[text()='Intraday'])[2]")
	private WebElement sell_dur_intraday;

	@FindBy(xpath = "(//label[text()='Market'])[2]")
	private WebElement sell_ptype_market;

	@FindBy(xpath = "(//label[text()='Custom Limit'])[2]")
	private WebElement sell_ptype_custm_limit;

	@FindBy(xpath = "(//label[text()='Long-term'])[1]")
	private WebElement buy_dur_long_term;

	@FindBy(xpath = "(//label[text()='Intraday'])[1]")
	private WebElement buy_dur_intraday;

	@FindBy(xpath = "(//label[text()='Market'])[1]")
	private WebElement buy_ptype_market;

	@FindBy(xpath = "(//label[text()='Custom Limit'])[1]")
	private WebElement buy_ptype_custm_limit;

	@FindBy(xpath = "//input[@name='input-Qunatity']")
	private WebElement buy_quantity_txt;
	@FindBy(xpath = "//input[@id='quantity']")
	private WebElement sell_quantity_txt;
	
	@FindBy(xpath = "(//input[@class='form-control'])[4]")
	private WebElement buy_cust_limit_txt;
	
	@FindBy(xpath = "(//input[@class='form-control form-control'])[2]")
	private WebElement sell_cust_limit_txt;

	@FindBy(xpath = "//button[text()='Buy']")
	private WebElement buyBtn2;

	@FindBy(xpath = "//button[text()='Sell']")
	private WebElement sellBtn2;

	@FindBy(xpath = "(//div[text()='Order Created successfully'])")
	private WebElement Mstate;
	
	@FindBy(xpath = "(//div[text()='Order Created Successfully'])")
	private WebElement IMstate;
	
	@FindBy(xpath = "(//div[text()='Limit Order Created Successfully'])[1]")
	private WebElement CLstate;

	public void clickOnBuyBtn1() {
		buyBtn1.click();
	}

	public void clickOnSellBtn1() {
		sellBtn1.click();
	}

	public void clickSellDurLongTerm() {
		sell_dur_long_term.click();
	}

	public void clickSellDurIntraday() {
		sell_dur_intraday.click();
	}

	public void clickSellPtypeMarket() {
		sell_ptype_market.click();
	}

	public void clickSellPtypeCustmLimit() {
		sell_ptype_custm_limit.click();
	}
	public void clickBuyDurLongTerm() {
		buy_dur_long_term.click();
	}

	public void clickBuyDurIntraday() {
		buy_dur_intraday.click();
	}

	public void clickBuyPtypeMarket() {
		buy_ptype_market.click();
	}

	public void clickBuyPtypeCustmLimit() {
		buy_ptype_custm_limit.click();
	}
	public void enterBuyQuantity(String quantity) {
		buy_quantity_txt.click();
		buy_quantity_txt.sendKeys(quantity);
	}
	public void enterSellQuantity(String quantity) {
		sell_quantity_txt.click();
		sell_quantity_txt.sendKeys(quantity);
	}
	
	public void enterBuyCustLimitTxt(String atprise) {
		buy_cust_limit_txt.click();
		buy_cust_limit_txt.clear();
		buy_cust_limit_txt.sendKeys(atprise);
	}
	public void enterSellCustLimitTxt(String atprise) {
		sell_cust_limit_txt.click();
		sell_cust_limit_txt.clear();
		sell_cust_limit_txt.sendKeys(atprise);
	}
	
	public void clickonBuyBtn2() {
		buyBtn2.click();

	}

	public void clickonSellBtn2() {
		sellBtn2.click();

	}

	public String getMStatus() {
		String st = Mstate.getText();
		return st;
	}
	public String getIMStatus() {
		String st = IMstate.getText();
		return st;
	}
	public String getCLstate() {
		String CLst = CLstate.getText();
		return CLst;
	}
}
